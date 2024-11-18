package JavaCollectionsFramework.TreeMap;
/*
12. Напишите программу на Java, чтобы получить максимальный ключ, меньший или равный данному ключу.
Похожа на задачу 26
 */
import java.util.TreeMap;

public class TreeMap_12 {
    public static void main(String[] args) {
        TreeMap<Integer, String> colorsMap = new TreeMap<>();
        colorsMap.put(5, "Red");
        colorsMap.put(4, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(2, "White");
        colorsMap.put(1, "Blue");
        System.out.println(colorsMap);

        System.out.println(colorsMap.floorKey(10));
    }
}
