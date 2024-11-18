package JavaCollectionsFramework.ArrayList;
/*
20. Напишите программу на Java, чтобы увеличить размер списка массивов
 */

import java.util.ArrayList;

public class ArrayList_20_ensureCapacity {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        System.out.println(colors.size());
        System.out.println(colors);

        colors.ensureCapacity(100);

        System.out.println(colors.size());
        System.out.println(colors);
    }
}
