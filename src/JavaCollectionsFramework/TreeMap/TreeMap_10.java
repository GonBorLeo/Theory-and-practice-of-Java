package JavaCollectionsFramework.TreeMap;
/*
10. Напишите программу на Java, чтобы получить представление в обратном порядке ключей, содержащихся в данной карте.
 */

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_10 {
    public static void main(String[] args) {
        TreeMap<Integer, String> colorsMap = new TreeMap<>();
        colorsMap.put(5, "Red");
        colorsMap.put(4, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(2, "White");
        colorsMap.put(1, "Blue");
        System.out.println(colorsMap);

        System.out.println(colorsMap.descendingKeySet());
    }
}
