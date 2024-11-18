package JavaCollectionsFramework.TreeMap;
/*
2. Напишите Java-программу для копирования содержимого Tree Map в другую Tree Map.
 */

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_2 {
    public static void main(String[] args) {
        Map<Integer, String> colorsMap = new TreeMap<>();
        colorsMap.put(5, "Red");
        colorsMap.put(4, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(2, "White");
        colorsMap.put(1, "Blue");
        System.out.println(colorsMap);

        Map<Integer, String> colorsMapNew = new TreeMap<>();
        colorsMapNew.put(6, "Brown");
        colorsMapNew.put(7, "Yellow");
        System.out.println(colorsMapNew);

        System.out.println();

        colorsMap.putAll(colorsMapNew);
        System.out.println(colorsMap);
        System.out.println(colorsMapNew);
    }
}
