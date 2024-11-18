package JavaCollectionsFramework.LinkedList;
/*
20. Напишите Java-программу для извлечения, но не удаления, первого элемента связанного списка.
 */
import java.util.LinkedList;

public class LinkedList_20_peekFirst {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);

        String strPeekF = colors.peekFirst();
        System.out.println(strPeekF);
        System.out.println(colors);
    }
}
