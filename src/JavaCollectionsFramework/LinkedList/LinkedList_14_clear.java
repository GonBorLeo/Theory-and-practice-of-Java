package JavaCollectionsFramework.LinkedList;

/*
14. Напишите программу на Java, чтобы удалить все элементы из связанного списка.
 */

import java.util.LinkedList;
import java.util.List;

public class LinkedList_14_clear {
    public static void main(String[] args) {
        List<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);

        colors.clear();
        System.out.println(colors);
    }
}
