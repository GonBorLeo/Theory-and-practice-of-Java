package JavaCollectionsFramework.TreeMap;
/*
25. Напишите программу на Java, чтобы получить отображение значения ключа, связанное с наименьшим ключом, большим или равным данному ключу. Вернуть ноль, если такого ключа нет.
Похожа на задачу 11
 */

import java.util.TreeMap;

public class TreeMap_25 {
    public static void main(String[] args) {
        TreeMap<Integer, String> colorsMap = new TreeMap<>();
        colorsMap.put(5, "Red");
        colorsMap.put(4, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(2, "White");
        colorsMap.put(1, "Blue");
        System.out.println(colorsMap);

        System.out.println(colorsMap.ceilingEntry(0));
    }
}
