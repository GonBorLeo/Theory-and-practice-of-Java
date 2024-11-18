package JavaCollectionsFramework.HashSet;
/*
5. Напишите программу на Java, чтобы проверить, хэш-набор пуст или нет.
 */

import java.util.HashSet;
import java.util.Set;

public class HashSet_5_isEmpty {
    public static void main(String[] args) {
        Set<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println(h_set);

        System.out.println(h_set.isEmpty());

        h_set.clear();

        System.out.println(h_set.isEmpty());
    }
}
