package JavaCollectionsFramework.HashMap;
/*
4. Напишите программу на Java, чтобы удалить все сопоставления с карты.
 */

import java.util.HashMap;
import java.util.Map;

public class HashMap_4_clear {
    public static void main(String[] args) {
        Map<Integer, String> colorsMap = new HashMap<>();
        colorsMap.put(1, "Red");
        colorsMap.put(2, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(4, "White");
        colorsMap.put(5, "Blue");
        System.out.println(colorsMap);

        colorsMap.clear();
        System.out.println(colorsMap);
    }
}
