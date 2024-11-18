package JavaCollectionsFramework.LinkedList;
/*
21. Напишите Java-программу для извлечения, но не удаления, последнего элемента связанного списка.
 */

import java.util.LinkedList;

public class LinkedList_21_peekLast {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);

        String strPeekL = colors.peekLast();
        System.out.println(strPeekL);
        System.out.println(colors);
    }
}
