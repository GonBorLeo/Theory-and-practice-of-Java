package JavaCollectionsFramework.TreeSet;
/*
3. Напишите программу на Java, чтобы добавить все элементы указанного набора деревьев в другой набор деревьев.
 */

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_3 {
    public static void main(String[] args) {
        Set<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");
        System.out.println(colors);

        Set<String> newColors = new TreeSet<>(colors);
        System.out.println(newColors);

    }
}
