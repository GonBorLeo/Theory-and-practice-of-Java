package JavaCollectionsFramework.LinkedList;
/*
9. Напишите программу на Java для вставки некоторых элементов в указанной позиции в связанный список.
 */

import java.util.LinkedList;
import java.util.List;

public class LinkedList_9_addAllInTheSecondPlace {
    public static void main(String[] args) {
        List<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);

        List<String> newColors = new LinkedList<>();
        newColors.add("Blue");
        newColors.add("Brown");
        System.out.println(newColors);

        colors.addAll(1, newColors);
        System.out.println(colors);
    }
}
