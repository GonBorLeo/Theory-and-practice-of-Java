package JavaCollectionsFramework.ArrayList;

import java.util.ArrayList;
import java.util.List;
/*
2. Напишите Java-программу для итерации всех элементов списка массивов
 */

public class ArrayList_2_foreach_print {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");

        for(String color : colors){
            System.out.println(color);
        }

    }
}
