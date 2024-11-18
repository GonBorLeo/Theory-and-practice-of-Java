package JavaCollectionsFramework.HashSet;
/*
11. Напишите Java-программу для сравнения двух наборов и сохранения элементов, которые одинаковы для обоих наборов.
*/

import java.util.HashSet;
import java.util.Set;

public class HashSet_11_retainAll {
    public static void main(String[] args) {
        Set<String> h_set1 = new HashSet<>();
        h_set1.add("Red");
        h_set1.add("Green");
        h_set1.add("Black");
        h_set1.add("White");
        System.out.println(h_set1);

        Set<String> h_set2 = new HashSet<>();
        h_set2.add("Red");
        h_set2.add("Pink");
        h_set2.add("Orange");
        h_set2.add("Black");
        System.out.println(h_set2);

        Set<String> result_set = new HashSet<>(h_set1);
        System.out.println(result_set);

        result_set.retainAll(h_set2);
        System.out.println(result_set);
    }
}
