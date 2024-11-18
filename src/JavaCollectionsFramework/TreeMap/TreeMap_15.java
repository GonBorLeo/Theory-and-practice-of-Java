package JavaCollectionsFramework.TreeMap;

import java.util.TreeMap;
/*
15. Напишите программу на Java, чтобы получить наименьший ключ, строго превышающий заданный ключ. Вернуть ноль, если такого ключа нет.
 */

public class TreeMap_15 {
    public static void main(String[] args) {
        TreeMap<Integer, String> colorsMap = new TreeMap<>();
        colorsMap.put(5, "Red");
        colorsMap.put(4, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(2, "White");
        colorsMap.put(1, "Blue");
        System.out.println(colorsMap);

        System.out.println(colorsMap.higherKey(2));
    }
}
