package JavaCollectionsFramework.PriorityQueue;
/*
1. Напишите программу на Java для создания новой очереди приоритетов, добавьте несколько цветов (строку) и распечатайте элементы очереди приоритетов.
 */

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_1 {
    public static void main(String[] args) {
        Queue<String> colors = new PriorityQueue<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("White");
        colors.add("Yellow");
        colors.add("Black");

        System.out.println(colors);

    }
}
