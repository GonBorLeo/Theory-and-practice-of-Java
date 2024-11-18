package JavaCollectionsFramework.LinkedList;
/*
25. Напишите Java-программу для проверки того, что связанный список пуст или нет.
 */

import java.util.LinkedList;
import java.util.List;

public class LinkedList_25_isEmpty {
    public static void main(String[] args) {
        List<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);
        System.out.println(colors.isEmpty());

        System.out.println();

        colors.clear();
        System.out.println(colors);
        System.out.println(colors.isEmpty());
    }
}
