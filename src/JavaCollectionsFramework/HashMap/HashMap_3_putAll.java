package JavaCollectionsFramework.HashMap;
/*
3. Напишите программу на Java, чтобы скопировать все сопоставления с указанной карты на другую карту.
 */

import java.util.HashMap;
import java.util.Map;

public class HashMap_3_putAll {
    public static void main(String[] args) {
        Map<Integer, String> colorsMap = new HashMap<>();
        colorsMap.put(1, "Red");
        colorsMap.put(2, "Green");
        colorsMap.put(3, "Black");
        System.out.println(colorsMap);

        Map<Integer, String> colorsMapNew = new HashMap<>();
        colorsMapNew.put(4, "White");
        colorsMapNew.put(5, "Blue");
        colorsMapNew.put(6, "Brown");
        System.out.println(colorsMapNew);

        colorsMapNew.putAll(colorsMap);
        System.out.println(colorsMapNew);
    }
}
