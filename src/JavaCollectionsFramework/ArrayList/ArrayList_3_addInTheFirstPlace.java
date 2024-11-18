package JavaCollectionsFramework.ArrayList;
/*
3. Напишите Java-программу для вставки элемента в список массивов в первой позиции.
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayList_3_addInTheFirstPlace {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        System.out.println(colors);
        colors.add("White");
        System.out.println(colors);
        colors.add("Black");
        System.out.println(colors);
        colors.add("Red");
        System.out.println(colors);

        colors.add(0, "Green");
        System.out.println(colors);
    }
}
