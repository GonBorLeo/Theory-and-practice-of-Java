package JavaCollectionsFramework.TreeMap;
/*
14. Напишите программу на Java, чтобы получить часть этой карты, ключи которой меньше (или равны, если inclusive true) данного ключа.
 */

import java.util.TreeMap;

public class TreeMap_14 {
    public static void main(String[] args) {
        TreeMap<Integer, String> colorsMap = new TreeMap<>();
        colorsMap.put(5, "Red");
        colorsMap.put(4, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(2, "White");
        colorsMap.put(1, "Blue");
        System.out.println(colorsMap);
        System.out.println(colorsMap.headMap(3, true));
    }
}
