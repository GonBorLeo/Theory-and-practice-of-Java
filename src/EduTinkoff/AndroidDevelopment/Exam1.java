package EduTinkoff.AndroidDevelopment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grades = scanner.nextInt(); // Получение числа, обозначающего количество оценок
        while (true) {
            if (!(grades < 1 || grades > 100_000)) {
                break;
            } else {
                System.out.println("Неверный ввод. Повторите ввод количества оценок");
                grades = scanner.nextInt();
            }
        }

        int[] numberOfGrades;
        do {
            numberOfGrades = new int[grades];
            for (int i = 0; i < grades; i++) {
                int number = Integer.parseInt(scanner.next());
                if (number < 2 || number > 5) {
                    System.out.println("Введенные оценки не входят в диапазон от 2 до 5. Повторите ввод оценок");
                    numberOfGrades = Arrays.stream(numberOfGrades).map(a -> 0).toArray();
                    scanner.nextLine();
                    break;
                } else {
                    numberOfGrades[i] = number;
                }
            }
        } while (numberOfGrades[grades - 1] < 2 || numberOfGrades[grades - 1] > 5); // Получение полного списка с оценками


        int totalNumberOfFives = getTotalNumberOfFives(numberOfGrades);

        System.out.println("Всего чисел = " + grades); // Число, обозначающее количество оценок
        System.out.println("Итоговый массив " + Arrays.toString(numberOfGrades)); // Массив со всеми оценками все оценки
        System.out.println("Количество пятерок за 7 дней = " + totalNumberOfFives); // Количество пятерок за 7 дней при условии, что за эти дни нет 2 или 3
    }

    private static int getTotalNumberOfFives(int[] numberOfGrades) {
        List<Integer> list = new ArrayList<>();
        int totalNumberOfFives = 0;
        int temp = 0;
        int iterator = 0;

        while (iterator + 6 != numberOfGrades.length) {
            for (int i = iterator; i < iterator + 7; i++) {
                if (numberOfGrades[i] < 4) {
                    list.clear();
                    break;
                } else if (numberOfGrades[i] > 3) {
                    list.add(numberOfGrades[i]);
                }
            }

            iterator++;
//            System.out.println(list);
            if (!list.isEmpty()) {
                for (Integer integer : list) {
                    if (integer == 5) {
                        temp++;
//                        System.out.println("temp = " + temp);
                    }
                }
                if (temp > totalNumberOfFives) {
                    totalNumberOfFives = temp;
//                    System.out.println("totalNumberOfFives = " + totalNumberOfFives);

                }
            }
            list.clear();
            temp = 0;
        }

        if (totalNumberOfFives == 0)
            totalNumberOfFives--;
        return totalNumberOfFives;
    }
}
