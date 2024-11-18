package JavaCollectionsFramework.ArrayList;
/*
4. Напишите Java-программу для извлечения элемента (по указанному индексу) из заданного списка массивов
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayList_4_get {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);

        System.out.println(colors.get(1));

        System.out.println(colors);
    }
}
