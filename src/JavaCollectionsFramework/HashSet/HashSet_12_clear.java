package JavaCollectionsFramework.HashSet;
/*
12. Напишите программу на Java, чтобы удалить все элементы из хеш-набора.
 */

import java.util.HashSet;
import java.util.Set;

public class HashSet_12_clear {
    public static void main(String[] args) {
        Set<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println(h_set);

        h_set.clear();
        System.out.println(h_set);
    }
}
