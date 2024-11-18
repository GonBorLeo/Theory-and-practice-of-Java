package JavaCollectionsFramework.TreeSet;
/*
1. Напишите Java-программу для создания нового набора деревьев, добавьте несколько цветов (строку) и распечатайте набор деревьев.
 */

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_1 {
    public static void main(String[] args) {
        Set<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");
        System.out.println(colors);

    }
}
