package JavaCollectionsFramework.TreeMap;
/*
1. Напишите программу на Java, чтобы связать указанное значение с указанным ключом в древовидной карте.
 */

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_1 {
    public static void main(String[] args) {
        Map<Integer, String> colorsMap = new TreeMap<>();
        colorsMap.put(5, "Red");
        colorsMap.put(4, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(2, "White");
        colorsMap.put(1, "Blue");
        System.out.println(colorsMap);

        for(Map.Entry<Integer, String> color : colorsMap.entrySet()){
            System.out.println(color.getKey() + " : " + color.getValue());
        }
    }
}
