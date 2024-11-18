package JavaCollectionsFramework.LinkedList;
/*
12. Напишите Java-программу для удаления указанного элемента из связанного списка.
 */

import java.util.LinkedList;
import java.util.List;

public class LinkedList_12_remove {
    public static void main(String[] args) {
        List<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);

        colors.remove("Red");
//        colors.remove(1);
        System.out.println(colors);
    }
}
