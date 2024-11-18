package JavaCollectionsFramework.LinkedList;
/*
1. Напишите программу на Java, чтобы добавить указанный элемент в конец связанного списка.
 */

import java.util.LinkedList;
import java.util.List;

public class LinkedList_1_create_add_print {
    public static void main(String[] args) {
        List<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);
    }
}
