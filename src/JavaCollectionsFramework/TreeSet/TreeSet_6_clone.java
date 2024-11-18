package JavaCollectionsFramework.TreeSet;
/*
6. Напишите Java-программу для клонирования списка наборов деревьев в другой набор деревьев.
 */

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_6_clone {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");
        System.out.println(colors);

        Set<String> newColors = (TreeSet<String>)colors.clone();
        System.out.println("Cloned tree list: " + newColors);
    }
}
