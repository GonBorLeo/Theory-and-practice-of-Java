package com.intellekta.installer;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

/*
Мы начинаем постепенно разматывать реквизиты:
A->B,C,D,E
(B->C),C,D,E =>
(B->C->D),C,D,E =>
(B->C->D->()), C{его не учитываем, т.к. в B он уже учтен}, D{аналогично}, E =>
(B->C->D->()), E =>
(B->C->D->()), (E->B {B уже был, поэтому зависимость перемещаем в начало}, F) =>
E->((B->C->D->()), F) =>
E->((B->C->D->()), (F->())).

Таким образом, последовательность будет такой: F, D, C, B, E, A

 */

public class Installer implements Subsystem {

    private String name;
    private int version;
    private Subsystem[] prerequisites;
    public static LinkedHashSet<Subsystem> fullPrerequisites = new LinkedHashSet<>();
    public static Set<Subsystem> endingPrerequisites = new HashSet<>();


    public Installer(String name, int version, Subsystem[] prerequisites) {
        this.name = name;
        this.version = version;
        this.prerequisites = prerequisites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Subsystem[] getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(Subsystem[] prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
    public String toString() {
        return "Installer{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }

    @Override
    public void install() {
        System.out.printf("%s version %d installed successfully%s", getName(), getVersion(), System.lineSeparator());
    }

    public Queue<Subsystem> setUpPlan() { // Разбираем все пререквизиты текущего объекта и формируем из них очередь установки.
        Queue<Subsystem> queue = new ArrayBlockingQueue<>(100);
        List<Subsystem> list = new LinkedList<>();

        getAllPrerequisites(this);

        return queue;
    }

    public static void getAllPrerequisites(Subsystem prerequisite) {
        Subsystem[] prerequisites = prerequisite.getPrerequisites();
        if (prerequisites.length != 0) {
            for (Subsystem subsystem : prerequisites) {
                fullPrerequisites.add(subsystem);
                getAllPrerequisites(subsystem);
            }
        } else {
            endingPrerequisites.add(prerequisite);
            fullPrerequisites.add(prerequisite);
        }
    }


    public static void prerequisitesSorted(Subsystem[] prerequisites) {
        for (int i = 0; i < prerequisites.length; i++)
            for (int j = i + 1; j < prerequisites.length; j++) {
                if (prerequisites[i].getVersion() > prerequisites[j].getVersion()) {
                    Subsystem temp = prerequisites[i];
                    prerequisites[i] = prerequisites[j];
                    prerequisites[j] = temp;
                }
                if (prerequisites[i].getName().compareToIgnoreCase(prerequisites[j].getName()) > 0) {
                    Subsystem temp = prerequisites[i];
                    prerequisites[i] = prerequisites[j];
                    prerequisites[j] = temp;
                }
            }
    }

    /*
Мы начинаем постепенно разматывать реквизиты:
A->B,C,D,E
(B->C),C,D,E =>
(B->C->D),C,D,E =>
(B->C->D->()), C{его не учитываем, т.к. в B он уже учтен}, D{аналогично}, E =>
(B->C->D->()), E =>
(B->C->D->()), (E->B {B уже был, поэтому зависимость перемещаем в начало}, F) =>
E->((B->C->D->()), F) =>
E->((B->C->D->()), (F->())).

Таким образом, последовательность будет такой: F, D, C, B, E, A
 */

    public void setUp(Queue<Subsystem> queue) { // Для сформированной очереди последовательно выполняет метод install()
        queue.poll().install();
    }
}