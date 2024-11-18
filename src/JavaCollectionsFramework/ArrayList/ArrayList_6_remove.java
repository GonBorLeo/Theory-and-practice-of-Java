package JavaCollectionsFramework.ArrayList;
/*
6. Напишите программу на Java для удаления третьего элемента из списка массивов.
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayList_6_remove {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        System.out.println(colors);

        colors.remove(2);

        System.out.println(colors);
    }
}
