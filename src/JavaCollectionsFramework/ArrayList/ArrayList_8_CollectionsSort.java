package JavaCollectionsFramework.ArrayList;
/*
8. Напишите программу на Java для сортировки заданного списка массивов
 */

import java.util.*;

public class ArrayList_8_CollectionsSort {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        System.out.println(colors);

        Collections.sort(colors);
        System.out.println(colors);
    }
}
