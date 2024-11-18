package JavaCollectionsFramework.HashSet;
/*
2. Напишите Java-программу для перебора всех элементов в хэш-списке.
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_2_foreach {
    public static void main(String[] args) {
        Set<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println(h_set);

        Iterator<String> p = h_set.iterator();
        while (p.hasNext()) {
            System.out.println(p.next());
        }

        for (String color : h_set){
            System.out.println(color);
        }
    }
}
