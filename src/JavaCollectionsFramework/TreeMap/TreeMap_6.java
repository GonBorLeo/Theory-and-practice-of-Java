package JavaCollectionsFramework.TreeMap;
/*
6. Напишите программу на Java, чтобы удалить все элементы из данной древовидной карты.
 */

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_6 {
    public static void main(String[] args) {
        Map<Integer, String> colorsMap = new TreeMap<>();
        colorsMap.put(5, "Red");
        colorsMap.put(4, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(2, "White");
        colorsMap.put(1, "Blue");
        System.out.println(colorsMap);

        colorsMap.clear();
        System.out.println(colorsMap);
    }

}
