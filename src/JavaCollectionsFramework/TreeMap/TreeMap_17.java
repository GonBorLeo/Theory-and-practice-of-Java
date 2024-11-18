package JavaCollectionsFramework.TreeMap;
/*
17. Напишите программу на Java, чтобы получить максимальный ключ строго меньше, чем данный ключ. Вернуть ноль, если такого ключа нет.
 */

import java.util.TreeMap;

public class TreeMap_17 {
    public static void main(String[] args) {
        TreeMap<Integer, String> colorsMap = new TreeMap<>();
        colorsMap.put(5, "Red");
        colorsMap.put(4, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(2, "White");
        colorsMap.put(1, "Blue");
        System.out.println(colorsMap);

        System.out.println(colorsMap.lowerKey(3));
    }
}
