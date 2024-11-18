package JavaCollectionsFramework.HashMap;
/*
1. Напишите программу на Java, чтобы связать указанное значение с указанным ключом в JavaCollectionsFramework.HashMap.
 */

import java.util.HashMap;
import java.util.Map;

public class HashMap_1_put_foreachPrint_getKeyGetValue_entrySet_Entry {
    public static void main(String[] args) {
        Map<Integer, String> colorsMap = new HashMap<>();
        colorsMap.put(1, "Red");
        colorsMap.put(2, "Green");
        colorsMap.put(3, "Black");
        colorsMap.put(4, "White");
        colorsMap.put(5, "Blue");

        System.out.println(colorsMap);

        for(Map.Entry<Integer, String> color : colorsMap.entrySet()){
            /*
            Тип x : a
             Map.Entry<Integer, String> - пара "ключ-значение"
             (при переборе обычного массива тут указывается тип переменных внутри массива)

             color - перебираемая часть

             colorsMap.entrySet() - возвращает набор всех пар "ключ-значение" в Map
             (при переборе обычного массива тут указывается имя массива)
             */

            System.out.println(color.getKey() + " : " + color.getValue());
        }
    }
}
