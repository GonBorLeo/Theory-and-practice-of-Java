package JavaCollectionsFramework.TreeMap;
/*
18. Напишите программу на Java, чтобы получить представление NavigableSet о ключах, содержащихся в карте.
 */

import java.util.TreeMap;

public class TreeMap_18 {
    public static void main(String[] args) {
        TreeMap<Integer, String> colorsMap = new TreeMap<>();
        colorsMap.put(5, "Red");
        colorsMap.put(4, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(2, "White");
        colorsMap.put(1, "Blue");
        System.out.println(colorsMap);

        System.out.println(colorsMap.navigableKeySet());
    }
}
