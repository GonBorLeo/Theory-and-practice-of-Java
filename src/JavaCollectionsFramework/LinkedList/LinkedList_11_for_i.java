package JavaCollectionsFramework.LinkedList;
/*
11. Напишите Java-программу для отображения элементов и их позиций в связанном списке.
 */

import java.util.LinkedList;
import java.util.List;

public class LinkedList_11_for_i {
    public static void main(String[] args) {
        List<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println("[" + i + ", " + colors.get(i) + "]");
        }
    }
}
