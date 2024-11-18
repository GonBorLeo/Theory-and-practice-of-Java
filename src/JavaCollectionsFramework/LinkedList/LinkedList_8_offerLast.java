package JavaCollectionsFramework.LinkedList;
/*
8. Напишите Java-программу для вставки указанного элемента в конец связанного списка.
 */

import java.util.LinkedList;

public class LinkedList_8_offerLast {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);

        colors.offerLast("Blue");
        System.out.println(colors);
    }
}
