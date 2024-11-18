package JavaCollectionsFramework.TreeSet;
/*
13. Напишите программу на Java, чтобы получить элемент в наборе деревьев, который строго меньше заданного элемента.
 */

import java.util.TreeSet;

public class TreeSet_13_lower {
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

        System.out.println(tree_num.lower(81));
        System.out.println(tree_num.lower(82));
        System.out.println(tree_num.lower(83));
    }

}
