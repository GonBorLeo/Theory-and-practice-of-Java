package JavaCollectionsFramework.LinkedList;
/*
2. Напишите Java-программу для перебора всех элементов в связанном списке.
 */

import java.util.LinkedList;
import java.util.List;

public class LinkedList_2_foreach {
    public static void main(String[] args) {
        List<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");

        for(String color : colors){
            System.out.println(color);
        }
    }
}
