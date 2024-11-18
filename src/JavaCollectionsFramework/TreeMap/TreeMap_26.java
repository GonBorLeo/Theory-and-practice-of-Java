package JavaCollectionsFramework.TreeMap;
/*
26. Напишите программу на Java, чтобы получить наименьший ключ, больший или равный данному ключу. Возвращает ноль, если такого ключа нет.
Похожа на задачу 12
 */
import java.util.TreeMap;

public class TreeMap_26 {
    public static void main(String[] args) {
        TreeMap<Integer, String> colorsMap = new TreeMap<>();
        colorsMap.put(5, "Red");
        colorsMap.put(4, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(2, "White");
        colorsMap.put(1, "Blue");
        System.out.println(colorsMap);

        System.out.println(colorsMap.ceilingKey(0));
    }
}
