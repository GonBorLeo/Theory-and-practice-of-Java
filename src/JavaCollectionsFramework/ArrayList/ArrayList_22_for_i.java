package JavaCollectionsFramework.ArrayList;

import java.util.ArrayList;
import java.util.List;
/*
22. Напишите Java-программу для печати всех элементов JavaCollectionsFramework.ArrayList, используя расположение элементов.
 */

public class ArrayList_22_for_i {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        System.out.println(colors);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
