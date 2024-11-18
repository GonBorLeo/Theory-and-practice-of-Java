package JavaCollectionsFramework.TreeSet;
/*
5. Напишите программу на Java, чтобы получить первый и последний элементы в наборе деревьев.
 */

import java.util.TreeSet;

public class TreeSet_5_firstLast {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");
        System.out.println(colors);

        System.out.println(colors.first());
        System.out.println(colors.last());
    }
}
