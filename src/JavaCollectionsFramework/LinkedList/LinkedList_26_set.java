package JavaCollectionsFramework.LinkedList;
/*
26. Напишите программу на Java для замены элемента в связанном списке.
 */

import java.util.LinkedList;
import java.util.List;

public class LinkedList_26_set {
    public static void main(String[] args) {
        List<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);

        colors.set(1, "Blue");
        System.out.println(colors);
    }
}
