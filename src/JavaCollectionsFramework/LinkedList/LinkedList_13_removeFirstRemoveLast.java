package JavaCollectionsFramework.LinkedList;
/*
13. Напишите программу на Java для удаления первого и последнего элемента из связанного списка.
 */

import java.util.LinkedList;

public class LinkedList_13_removeFirstRemoveLast {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);

        colors.removeFirst();
        colors.removeLast();
        System.out.println(colors);
    }
}
