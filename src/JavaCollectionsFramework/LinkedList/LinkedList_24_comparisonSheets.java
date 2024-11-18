package JavaCollectionsFramework.LinkedList;
/*
24. Напишите программу на Java для сравнения двух связанных списков.
 */

import java.util.LinkedList;
import java.util.List;

public class LinkedList_24_comparisonSheets {
    public static void main(String[] args) {
        List<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);

        List<String> numbers = new LinkedList<>();
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("White");
        System.out.println(numbers);

        System.out.println();

        List<String> equalsList = new LinkedList<>();
        for (String color : colors)
            equalsList.add(numbers.contains(color) ? "Yes" : "No");
        System.out.println(equalsList);
    }
}
