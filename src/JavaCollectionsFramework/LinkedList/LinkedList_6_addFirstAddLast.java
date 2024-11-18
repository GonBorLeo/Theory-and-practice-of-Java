package JavaCollectionsFramework.LinkedList;
/*
6. Напишите программу на Java для вставки элементов в связанный список в первой и последней позиции
 */

import java.util.LinkedList;

public class LinkedList_6_addFirstAddLast {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);

        colors.addFirst("Blue");
        colors.addLast("Brown");
        System.out.println(colors);
    }
}