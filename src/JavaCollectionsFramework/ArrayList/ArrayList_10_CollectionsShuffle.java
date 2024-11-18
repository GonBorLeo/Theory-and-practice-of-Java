package JavaCollectionsFramework.ArrayList;
/*
10. Напишите программу на Java для перемешивания элементов в списке массивов.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_10_CollectionsShuffle {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        System.out.println(colors);

        Collections.shuffle(colors);
        System.out.println(colors);
    }
}
