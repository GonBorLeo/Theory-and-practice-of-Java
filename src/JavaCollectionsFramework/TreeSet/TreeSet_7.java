package JavaCollectionsFramework.TreeSet;
/*
7. Напишите программу на Java, чтобы получить количество элементов в наборе деревьев.
 */

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_7 {
    public static void main(String[] args) {
        Set<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");
        System.out.println(colors);

        System.out.println(colors.size());
    }
}
