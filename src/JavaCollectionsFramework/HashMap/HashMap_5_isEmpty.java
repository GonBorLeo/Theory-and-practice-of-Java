package JavaCollectionsFramework.HashMap;
/*
5. Напишите программу на Java, чтобы проверить, содержит ли карта сопоставления значения ключа (пусто) или нет.
 */

import java.util.HashMap;
import java.util.Map;

public class HashMap_5_isEmpty {
    public static void main(String[] args) {
        Map<Integer, String> colorsMap = new HashMap<>();
        colorsMap.put(1, "Red");
        colorsMap.put(2, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(4, "White");
        colorsMap.put(5, "Blue");
        System.out.println(colorsMap);
        System.out.println(colorsMap.isEmpty());

        System.out.println();

        colorsMap.clear();
        System.out.println(colorsMap);
        System.out.println(colorsMap.isEmpty());
    }
}
