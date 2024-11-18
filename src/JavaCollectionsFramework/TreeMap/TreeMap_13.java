package JavaCollectionsFramework.TreeMap;

import java.util.Map;
import java.util.TreeMap;
/*
13. Напишите программу на Java, чтобы получить часть карты, чьи ключи строго меньше, чем данный ключ.
 */

public class TreeMap_13 {
    public static void main(String[] args) {
        TreeMap<Integer, String> colorsMap = new TreeMap<>();
        colorsMap.put(5, "Red");
        colorsMap.put(4, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(2, "White");
        colorsMap.put(1, "Blue");
        System.out.println(colorsMap);
        System.out.println(colorsMap.headMap(3));
    }
}
