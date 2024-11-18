package JavaCollectionsFramework.HashSet;
/*
6. Напишите Java-программу для клонирования хеш-набора в другой хеш-набор.
 */

import java.util.HashSet;
import java.util.Set;

public class HashSet_6_clone {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println(h_set);

        HashSet <String> new_h_set_1;
        new_h_set_1 = (HashSet)h_set.clone();
        System.out.println(new_h_set_1);

        Set<String> new_h_set_2 = new HashSet<>(h_set);
        System.out.println(new_h_set_2);
    }
}
