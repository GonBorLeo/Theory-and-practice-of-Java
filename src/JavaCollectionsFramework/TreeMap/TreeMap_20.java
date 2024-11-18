package JavaCollectionsFramework.TreeMap;
/*
20. Напишите Java-программу для удаления и получения сопоставления ключ-значение, связанного с наибольшим ключом на этой карте.
 */

import java.util.TreeMap;

public class TreeMap_20 {
    public static void main(String[] args) {
        TreeMap<Integer, String> colorsMap = new TreeMap<>();
        colorsMap.put(5, "Red");
        colorsMap.put(4, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(2, "White");
        colorsMap.put(1, "Blue");
        System.out.println(colorsMap);

        System.out.println(colorsMap.pollLastEntry());
        System.out.println(colorsMap);
    }
}
