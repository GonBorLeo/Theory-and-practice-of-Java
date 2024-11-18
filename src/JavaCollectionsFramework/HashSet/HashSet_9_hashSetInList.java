package JavaCollectionsFramework.HashSet;
/*
9. Напишите программу на Java для преобразования хэш-набора в List / JavaCollectionsFramework.ArrayList.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet_9_hashSetInList {
    public static void main(String[] args) {
        Set<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println(h_set);

        List<String> a_list = new ArrayList<>(h_set);
        System.out.println(a_list);
    }
}
