package JavaCollectionsFramework.ArrayList;
/*
12. Напишите программу на Java для извлечения части списка массивов.
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayList_12_subList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        System.out.println(colors);

        List<String> subList = colors.subList(0, 2);

        System.out.println(subList);
    }
}
