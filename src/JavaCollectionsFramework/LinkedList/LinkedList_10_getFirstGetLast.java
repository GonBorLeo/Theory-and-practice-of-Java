package JavaCollectionsFramework.LinkedList;
/*
10. Напишите программу на Java, чтобы получить первое и последнее вхождение указанных элементов в связанный список.
 */

import java.util.LinkedList;

public class LinkedList_10_getFirstGetLast {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);

        System.out.println(colors.getFirst());
        System.out.println(colors.getLast());
    }
}
