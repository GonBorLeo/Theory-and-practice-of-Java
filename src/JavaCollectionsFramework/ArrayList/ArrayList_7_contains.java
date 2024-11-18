package JavaCollectionsFramework.ArrayList;
/*
7. Напишите программу на Java для поиска элемента в списке массивов.
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayList_7_contains {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        System.out.println(colors);

        for(String color : colors){
            if(color.equals("Red")){
                System.out.println(color);
            }
        }

        if (colors.contains("Red")) {
            System.out.println("Искомый цвет найден");
        } else {
            System.out.println("Искомый цвет отсутствует");
        }
    }
}
