package JavaCollectionsFramework.LinkedList;
/*
19. Напишите Java-программу для удаления и возврата первого элемента связанного списка.
 */

import java.util.LinkedList;

public class LinkedList_19_pop {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);

        String strPop = colors.pop();
        System.out.println(strPop);

        System.out.println(colors);
    }
}
