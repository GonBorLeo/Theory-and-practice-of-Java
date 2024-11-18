package JavaCollectionsFramework.ArrayList;
/*
1. Напишите программу на Java, чтобы создать новый список массивов, добавить несколько цветов (строку) и распечатать коллекцию
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayList_1_create_add_print {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        System.out.println(colors);
        colors.add("White");
        System.out.println(colors);
        colors.add("Black");
        System.out.println(colors);
        colors.add("Red");
        System.out.println(colors);
    }
}
