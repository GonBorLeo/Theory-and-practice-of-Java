package JavaCollectionsFramework.ArrayList;
/*
19. Напишите программу на Java, чтобы урезать емкость списка массива текущим размером списка.
 */

import java.util.ArrayList;

public class ArrayList_19_trimToSize {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(30);
        System.out.println(colors.size());

        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");

        System.out.println(colors.size());
        System.out.println(colors);

        colors.trimToSize();

        System.out.println(colors.size());
        for (String color : colors){
            System.out.println("Color = " + color);
        }

    }
}
