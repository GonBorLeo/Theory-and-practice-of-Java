package JavaCollectionsFramework.TreeSet;
/*
9. Напишите программу на Java, чтобы найти числа меньше 7 в наборе деревьев.
 */

import java.util.TreeSet;

public class TreeSet_9_headSet {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(3);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);
        System.out.println(numbers);
        System.out.println(numbers.headSet(7));

        for (Integer x : numbers)
            if (x < 7) System.out.println(x);
    }
}