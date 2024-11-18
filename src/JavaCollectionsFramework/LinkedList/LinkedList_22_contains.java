package JavaCollectionsFramework.LinkedList;
/*
22. Напишите программу на Java, чтобы проверить, существует ли определенный элемент в связанном списке.
 */

import java.util.LinkedList;
import java.util.List;

public class LinkedList_22_contains {
    public static void main(String[] args) {
        List<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);

        System.out.println(colors.contains("Blue"));
        System.out.println(colors.contains("Red"));

    }
}
