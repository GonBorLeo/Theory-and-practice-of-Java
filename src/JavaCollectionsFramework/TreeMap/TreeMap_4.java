package JavaCollectionsFramework.TreeMap;
/*
4. Напишите программу на Java для поиска значения в древовидной карте.
 */

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_4 {
    public static void main(String[] args) {
        Map<Integer, String> colorsMap = new TreeMap<>();
        colorsMap.put(5, "Red");
        colorsMap.put(4, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(2, "White");
        colorsMap.put(1, "Blue");
        System.out.println(colorsMap);

        System.out.println(colorsMap.containsValue("Red"));
        System.out.println(colorsMap.containsValue("Yellow"));

    }
}
