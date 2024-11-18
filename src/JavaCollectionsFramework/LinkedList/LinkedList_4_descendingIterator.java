package JavaCollectionsFramework.LinkedList;
/*
4. Напишите Java-программу для итерации связанного списка в обратном порядке.
 */

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_4_descendingIterator {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);

        Iterator<String> p = colors.descendingIterator();
        while (p.hasNext()) {
            System.out.println(p.next());
        }

    }
}
