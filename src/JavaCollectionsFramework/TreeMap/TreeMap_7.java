package JavaCollectionsFramework.TreeMap;
/*
7. Напишите программу на Java для сортировки ключей в Tree Map с помощью компаратора.
 */

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_7 {
    public static void main(String[] args) {
        Map<Integer, String> colorsMap = new TreeMap<>();
        colorsMap.put(5, "Red");
        colorsMap.put(4, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(2, "White");
        colorsMap.put(1, "Blue");
        System.out.println(colorsMap);
    }
}

class sort_key implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}
