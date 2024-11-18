package JavaCollectionsFramework.ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
16. Напишите Java-программу для клонирования списка массивов в другой список массивов
 */
public class ArrayList_16_cloning {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        System.out.println(colors);

        System.out.println();

        List<String> colorsNewList = new ArrayList<>(colors);

        System.out.println(colors);
        System.out.println(colorsNewList);
    }
}
