package JavaCollectionsFramework.HashSet;
/*
10. Напишите Java-программу для сравнения двух хэш-наборов.
 */

import java.util.HashSet;
import java.util.Set;

public class HashSet_10_contains {
    public static void main(String[] args) {
        Set<String> h_set1 = new HashSet<>();
        h_set1.add("Red");
        h_set1.add("Green");
        h_set1.add("Black");
        h_set1.add("White");

        Set<String> h_set2 = new HashSet<>();
        h_set2.add("Red");
        h_set2.add("Pink");
        h_set2.add("Orange");
        h_set2.add("Black");

        Set<String> result_set = new HashSet<>();
        for (String element : h_set1) {
            System.out.println(h_set2.contains(element) ? "Yes" : "No");
        }
    }
}
