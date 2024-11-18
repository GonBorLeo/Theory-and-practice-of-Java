package JavaCollectionsFramework.LinkedList;
/*
15. Напишите программу на Java, которая поменяет два элемента в связанном списке.
 */

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_15_CollectionsSwap {
    public static void main(String[] args) {
        List<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);

        Collections.swap(colors,0, 2);
        System.out.println(colors);
    }
}
