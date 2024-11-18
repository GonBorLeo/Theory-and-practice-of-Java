package JavaCollectionsFramework.TreeSet;
/*
16. Напишите Java-программу для удаления заданного элемента из набора деревьев.
 */

import java.util.TreeSet;

public class TreeSet_16_remove {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");
        System.out.println(colors);

        colors.remove("White");

        System.out.println(colors);

    }
}
