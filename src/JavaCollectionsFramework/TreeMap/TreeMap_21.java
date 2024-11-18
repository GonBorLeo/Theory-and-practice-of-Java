package JavaCollectionsFramework.TreeMap;
/*
21. Напишите программу на Java, чтобы получить часть карты, ключи которой варьируются от заданного ключа (включительно) до другого ключа (эксклюзив).
 */

import java.util.TreeMap;

public class TreeMap_21 {
    public static void main(String[] args) {
        TreeMap<Integer, String> colorsMap = new TreeMap<>();
        colorsMap.put(5, "Red");
        colorsMap.put(4, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(2, "White");
        colorsMap.put(1, "Blue");
        System.out.println(colorsMap);

        System.out.println(colorsMap.subMap(2, 4));
    }
}
