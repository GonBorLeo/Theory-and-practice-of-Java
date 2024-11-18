package JavaCollectionsFramework.LinkedList;
/*
17. Напишите программу на Java, чтобы объединить два связанных списка.
 */

import java.util.LinkedList;
import java.util.List;

public class LinkedList_17_addAll {
    public static void main(String[] args) {
        List<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);

        List<String> colorsNew = new LinkedList<>();
        colorsNew.add("Brown");
        colorsNew.add("Blue");
        colorsNew.add("Yellow");
        System.out.println(colorsNew);

        List<String> colorsJoin = new LinkedList<>();
        colorsJoin.addAll(colors);
        colorsJoin.addAll(colorsNew);
        System.out.println(colorsJoin);
    }
}
