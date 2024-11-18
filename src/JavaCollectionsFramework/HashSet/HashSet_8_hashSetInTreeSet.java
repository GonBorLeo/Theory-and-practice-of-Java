package JavaCollectionsFramework.HashSet;
/*
8. Напишите Java-программу для преобразования хэш-набора в набор деревьев.
*/

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_8_hashSetInTreeSet {
    public static void main(String[] args) {
        Set<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println(h_set);

        Set<String> t_set = new TreeSet<>(h_set);
        System.out.println(t_set);
    }
}
