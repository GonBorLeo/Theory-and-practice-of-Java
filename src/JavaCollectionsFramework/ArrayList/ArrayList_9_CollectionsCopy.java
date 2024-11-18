package JavaCollectionsFramework.ArrayList;
/*
9. Напишите программу на Java для копирования одного списка массивов в другой.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_9_CollectionsCopy {
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
        numbers.add("5");
        System.out.println(numbers);

        System.out.println();

        Collections.copy(colors, numbers);
        System.out.println(colors);
        System.out.println(numbers);
    }
}
