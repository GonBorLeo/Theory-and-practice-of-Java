package JavaCollectionsFramework.ArrayList;
/*
13. Напишите программу на Java для сравнения двух списков массивов.
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayList_13_comparingTwoArrays {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        System.out.println(colors);

        List<String> numbers = new ArrayList<>();
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        numbers.add("White");
        System.out.println(numbers);

        System.out.println();

        ArrayList<String> equalsList = new ArrayList<>();
        for (String color : colors)
            equalsList.add(numbers.contains(color) ? "Yes" : "No");
        System.out.println(equalsList);
    }
}
