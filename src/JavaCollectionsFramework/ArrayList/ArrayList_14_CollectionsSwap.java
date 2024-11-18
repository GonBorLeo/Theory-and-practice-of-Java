package JavaCollectionsFramework.ArrayList;
/*
14. Напишите Java-программу, меняющую местами два элемента в списке массивов.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_14_CollectionsSwap {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        System.out.println(colors);

        Collections.swap(colors, 0, 2);

        System.out.println(colors);
    }
}
