package JavaCollectionsFramework.LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/*
16. Напишите программу на Java, чтобы перемешать элементы в связанном списке.
 */

public class LinkedList_16_CollectionsShuffle {
    public static void main(String[] args) {
        List<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Yellow");
        System.out.println(colors);

        Collections.shuffle(colors);
        System.out.println(colors);
    }
}
