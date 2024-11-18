package JavaCollectionsFramework.HashSet;
/*
1. Напишите Java-программу для добавления указанного элемента в конец хеш-набора.
 */

import java.util.HashSet;
import java.util.Set;

public class HashSet_1_add_print {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println(h_set);
    }
}
