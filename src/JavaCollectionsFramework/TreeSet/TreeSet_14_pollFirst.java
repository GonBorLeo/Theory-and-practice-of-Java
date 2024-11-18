package JavaCollectionsFramework.TreeSet;
/*
14. Напишите программу на Java для извлечения и удаления первого элемента набора деревьев.
 */

import java.util.TreeSet;

public class TreeSet_14_pollFirst {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");
        System.out.println(colors);

        System.out.println(colors.pollFirst());
        System.out.println(colors);

    }
}
