package JavaCollectionsFramework.TreeSet;
/*
15. Напишите программу на Java для извлечения и удаления последнего элемента набора деревьев.
 */

import java.util.TreeSet;

public class TreeSet_15_pollLast {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");
        System.out.println(colors);

        System.out.println(colors.pollLast());
        System.out.println(colors);

    }
}
