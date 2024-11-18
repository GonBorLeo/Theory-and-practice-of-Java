package JavaCollectionsFramework.HashSet;
/*
7. Напишите Java-программу для преобразования хэш-набора в массив.
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSet_7_toArray {
    public static void main(String[] args) {
        Set<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println(h_set);

        String[] new_array = new String[h_set.size()];
        h_set.toArray(new_array);

        System.out.println(Arrays.toString(h_set.toArray()));

        for (int i = 0; i < h_set.toArray().length; i++) {
            System.out.println(h_set.toArray()[i]);
        }
    }
}
