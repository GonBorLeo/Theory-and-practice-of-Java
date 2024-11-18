package JavaCollectionsFramework.TreeSet;
/*
2. Напишите Java-программу для перебора всех элементов в наборе деревьев
 */

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_2 {
    public static void main(String[] args) {
        Set<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");
        System.out.println(colors);

        for (String color : colors) {
            System.out.println(color);
        }

    }
}
