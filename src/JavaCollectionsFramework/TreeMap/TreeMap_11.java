package JavaCollectionsFramework.TreeMap;

import java.util.Map;
import java.util.TreeMap;
/*
11. Напишите программу на Java, чтобы получить сопоставление значения ключа, связанного с наибольшим ключом, меньшим или равным данному ключу.
Похожа на задачу 25
 */

public class TreeMap_11 {
    public static void main(String[] args) {
        TreeMap<Integer, String> colorsMap = new TreeMap<>();
        colorsMap.put(5, "Red");
        colorsMap.put(4, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(2, "White");
        colorsMap.put(1, "Blue");
        System.out.println(colorsMap);

        System.out.println(colorsMap.floorEntry(10));
    }
}
