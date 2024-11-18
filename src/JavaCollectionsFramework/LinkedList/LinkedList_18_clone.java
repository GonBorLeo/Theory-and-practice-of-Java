package JavaCollectionsFramework.LinkedList;
/*
18. Напишите программу на Java, чтобы клонировать связанный список в другой связанный список.
 */

import java.util.LinkedList;

public class LinkedList_18_clone {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);

        LinkedList<String> colorsNew = (LinkedList)colors.clone();

        colorsNew.add("qwerty");
        System.out.println(colorsNew);
    }
}
