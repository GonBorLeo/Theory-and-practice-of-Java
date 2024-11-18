package JavaCollectionsFramework.TreeSet;
/*
8. Напишите программу на Java для сравнения двух наборов деревьев.
 */

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_8 {
    public static void main(String[] args) {
        Set<String> t_set1 = new TreeSet<>();
        t_set1.add("Red");
        t_set1.add("Green");
        t_set1.add("Black");
        t_set1.add("White");
        System.out.println(t_set1);

        Set<String> t_set2 = new TreeSet<>();
        t_set2.add("Red");
        t_set2.add("Pink");
        t_set2.add("Black");
        t_set2.add("Orange");
        System.out.println(t_set2);

        for (String element : t_set1){
            System.out.print(t_set2.contains(element) ? "Yes " : "No ");
        }

    }
}
