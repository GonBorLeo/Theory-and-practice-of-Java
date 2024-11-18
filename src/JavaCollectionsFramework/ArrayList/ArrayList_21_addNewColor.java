package JavaCollectionsFramework.ArrayList;
/*
21. Напишите программу на Java, чтобы заменить второй элемент JavaCollectionsFramework.ArrayList указанным элементом.
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayList_21_addNewColor {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        System.out.println(colors);

        String newColor = "Brown";

        colors.set(2, newColor);

        System.out.println(colors);
    }
}
