package JavaCollectionsFramework.HashMap;
/*
6. Напишите программу на Java, чтобы получить поверхностную копию экземпляра JavaCollectionsFramework.HashMap.
 */

import java.util.HashMap;

public class HashMap_6_clone {
    public static void main(String[] args) {
        HashMap<Integer, String> colorsMap = new HashMap<>();
        colorsMap.put(1, "Red");
        colorsMap.put(2, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(4, "White");
        colorsMap.put(5, "Blue");
        System.out.println(colorsMap);

        HashMap<Integer, String> colorsMapNew = new HashMap<>();
        colorsMapNew = (HashMap)colorsMap.clone();

        System.out.println(colorsMapNew);
    }
}
