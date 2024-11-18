package JavaCollectionsFramework.TreeSet;
/*
4. Напишите программу на Java для создания представления в обратном порядке элементов, содержащихся в данном наборе деревьев.
 */

import java.util.TreeSet;

public class TreeSet_4_descendingSet {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");
        System.out.println(colors);

        System.out.println(colors.descendingSet());

    }
}
