package JavaCollectionsFramework.ArrayList;
/*
11. Напишите Java-программу для обращения (изменения порядка) элементов в списке массивов.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_11_CollectionsReverse {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        System.out.println(colors);

        Collections.reverse(colors);
        System.out.println(colors);
    }
}
