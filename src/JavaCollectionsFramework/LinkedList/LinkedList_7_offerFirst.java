package JavaCollectionsFramework.LinkedList;
/*
7. Напишите Java-программу для вставки указанного элемента в начало связанного списка.
 */

import java.util.LinkedList;

public class LinkedList_7_offerFirst {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);

        colors.offerFirst("Blue");
        System.out.println(colors);
    }
}
