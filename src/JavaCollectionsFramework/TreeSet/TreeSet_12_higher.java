package JavaCollectionsFramework.TreeSet;
/*
12. Напишите программу на Java, чтобы получить элемент в наборе деревьев, который строго больше или равен данному элементу.
 */

import java.util.TreeSet;

public class TreeSet_12_higher {
    public static void main(String[] args) {
        TreeSet<Integer> tree_num = new TreeSet<>();

        tree_num.add(10);
        tree_num.add(22);
        tree_num.add(36);
        tree_num.add(25);
        tree_num.add(16);
        tree_num.add(70);
        tree_num.add(82);
        tree_num.add(89);
        tree_num.add(14);

        System.out.println(tree_num);

        System.out.println(tree_num.higher(81));
        System.out.println(tree_num.higher(82));
        System.out.println(tree_num.higher(83));
    }
}
