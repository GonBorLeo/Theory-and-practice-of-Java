package JavaCollectionsFramework.HashMap;
/*
7. Напишите программу на Java, чтобы проверить, содержит ли карта сопоставление для указанного ключа.
 */

import java.util.HashMap;
import java.util.Map;

public class HashMap_7_containsKey {
    public static void main(String[] args) {
        Map<Integer, String> colorsMap = new HashMap<>();
        colorsMap.put(1, "Red");
        colorsMap.put(2, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(4, "White");
        colorsMap.put(5, "Blue");
        System.out.println(colorsMap);

        System.out.println(colorsMap.containsKey(3));
        System.out.println(colorsMap.containsKey(10));

    }
}
