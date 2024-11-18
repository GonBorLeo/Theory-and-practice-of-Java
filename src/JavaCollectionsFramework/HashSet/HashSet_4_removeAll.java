package JavaCollectionsFramework.HashSet;
/*
4. Напишите программу на Java, чтобы очистить хэш-набор.
 */

import java.util.HashSet;
import java.util.Set;

public class HashSet_4_removeAll {
    public static void main(String[] args) {
        Set<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println(h_set);

        h_set.removeAll(h_set);
        System.out.println(h_set);
    }
}
