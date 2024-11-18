package JavaCollectionsFramework.TreeMap;
/*
24. Напишите программу на Java, чтобы получить часть карты, ключи которой больше, чем для данного ключа.
 */

import java.util.TreeMap;

public class TreeMap_24 {
    public static void main(String[] args) {
        TreeMap<Integer, String> colorsMap = new TreeMap<>();
        colorsMap.put(5, "Red");
        colorsMap.put(4, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(2, "White");
        colorsMap.put(1, "Blue");
        System.out.println(colorsMap);

        System.out.println(colorsMap.tailMap(3, false));
    }
}
