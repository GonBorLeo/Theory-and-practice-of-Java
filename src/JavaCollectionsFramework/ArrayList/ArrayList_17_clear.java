package JavaCollectionsFramework.ArrayList;
/*
17. Напишите программу на Java, чтобы очистить список массивов.
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayList_17_clear {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        System.out.println(colors);

        colors.clear();

        System.out.println(colors);
    }
}
