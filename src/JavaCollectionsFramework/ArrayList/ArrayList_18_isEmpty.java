package JavaCollectionsFramework.ArrayList;
/*
18. Напишите Java-программу для проверки того, что список массивов пуст или нет.
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayList_18_isEmpty {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        System.out.println(colors);
        System.out.println(colors.isEmpty());

        colors.clear();
        System.out.println(colors);
        System.out.println(colors.isEmpty());
    }
}
