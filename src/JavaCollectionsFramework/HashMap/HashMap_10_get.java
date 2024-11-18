package JavaCollectionsFramework.HashMap;
/*
10. Напишите программу на Java, чтобы получить значение указанного ключа на карте.
 */

import java.util.HashMap;
import java.util.Map;

public class HashMap_10_get {
    public static void main(String[] args) {
        Map<Integer, String> colorsMap = new HashMap<>();
        colorsMap.put(1, "Red");
        colorsMap.put(2, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(4, "White");
        colorsMap.put(5, "Blue");
        System.out.println(colorsMap);

        System.out.println(colorsMap.get(3));
    }
}
