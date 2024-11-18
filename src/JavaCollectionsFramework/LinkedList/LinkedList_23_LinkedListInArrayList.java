package JavaCollectionsFramework.LinkedList;
/*
23. Напишите программу на Java для преобразования связанного списка в список массивов.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_23_LinkedListInArrayList {
    public static void main(String[] args) {
        List<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);

        List<String> colorsArr = new ArrayList<>(colors);
        System.out.println(colorsArr);
    }
}
