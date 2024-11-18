package JavaCollectionsFramework.TreeMap;

import java.util.TreeMap;

/*
8. Напишите программу на Java, чтобы получить сопоставление ключ-значение, связанное с наибольшим ключом и наименьшим ключом в карте.
 */
public class TreeMap_8 {
    public static void main(String[] args) {
        TreeMap<Integer, String> colorsMap = new TreeMap<>();
        colorsMap.put(5, "Red");
        colorsMap.put(4, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(2, "White");
        colorsMap.put(1, "Blue");
        System.out.println(colorsMap);

        System.out.println(colorsMap.firstEntry());

        System.out.println(colorsMap.lastEntry());
    }
}
