package JavaCollectionsFramework.TreeMap;
/*
3. Напишите программу на Java для поиска ключа в древовидной карте.
 */

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_3 {
    public static void main(String[] args) {
        Map<Integer, String> colorsMap = new TreeMap<>();
        colorsMap.put(5, "Red");
        colorsMap.put(4, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(2, "White");
        colorsMap.put(1, "Blue");
        System.out.println(colorsMap);

        System.out.println(colorsMap.containsKey(1));
        System.out.println(colorsMap.containsKey(10));
    }
}
