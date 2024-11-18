package JavaCollectionsFramework.ArrayList;
/*
5. Напишите Java-программу для обновления определенного элемента массива по заданному элементу.
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayList_5_set {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);

        colors.set(colors.indexOf("Black"), "Blue");

        System.out.println(colors);
    }
}
