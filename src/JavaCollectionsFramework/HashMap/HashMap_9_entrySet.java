package JavaCollectionsFramework.HashMap;
/*
9. Напишите программу на Java для создания набора представлений отображений, содержащихся в карте.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_9_entrySet {
    public static void main(String[] args) {
        Map<Integer, String> colorsMap = new HashMap<>();
        colorsMap.put(1, "Red");
        colorsMap.put(2, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(4, "White");
        colorsMap.put(5, "Blue");
        System.out.println(colorsMap);

        Set<Map.Entry<Integer, String>> set = colorsMap.entrySet();
        System.out.println("Set values: " + set);
    }
}
