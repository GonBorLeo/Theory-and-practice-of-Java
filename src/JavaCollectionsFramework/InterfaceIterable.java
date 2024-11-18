package JavaCollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Интерфейс Iterable (дословно - то, по чему можно итерироваться)
позволяет понять Java, что этот класс не просто обычный класс,
а также сущность, по которой мы можем проходиться циклами
 */
public class InterfaceIterable {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        /*
        До Java 5 получали доступ к объекту интерфейса Iterator,
        который лежит в нашем объекте класса ArrayList, который
        хранит в себе эти элементы

        Чтобы получить доступ к объекту итератора, который лежит в
        нашей коллекции, раньше писали list.iterator().
        Таким образом мы получаем объект класса, который реализует
        интерфейс Iterator и в этом объекте описана логика
        прохождения по элементам нашей коллекции

        Итератор в себе хранит указатель на элемент объекта.
        В первое получение итератора указатель
        указывает на пространство до первого объекта

        При использовании итератора мы можем одновременно и
        перебирать, и удалять элементы в коллекции
         */
        Iterator<Integer> iterator = list.iterator();

        int idx = 0;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

            /*
            В отличие от метода remove(), который имеется в коллекциях,
            метод remove() в итераторе не принимает на вход аргумент, т.к.
            при прохождении коллекции при помощи итератора мы можем удалить
            только текущий элемент (на котором стоит указатель итератора)
             */
            if (idx == 1)
                iterator.remove();

            idx++;
        }
        System.out.println(list);

        // Java 5
//        for (int x : list) {
//            System.out.println(x);
//
//        }
    }
}
