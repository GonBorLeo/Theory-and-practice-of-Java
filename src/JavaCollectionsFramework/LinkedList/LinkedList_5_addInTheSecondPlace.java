package JavaCollectionsFramework.LinkedList;
/*
5. Напишите Java-программу для вставки указанного элемента в указанную позицию в связанном списке.
 */

import java.util.LinkedList;
import java.util.List;

public class LinkedList_5_addInTheSecondPlace {
    public static void main(String[] args) {
        List<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);

        colors.add(1, "Blue");
        System.out.println(colors);
    }
}
