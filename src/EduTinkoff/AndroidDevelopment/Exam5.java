package EduTinkoff.AndroidDevelopment;

import java.util.Scanner;

public class Exam5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Получение числа, обозначающего количество строк в таблице
        while (n < 1 || n > 10000) {
            System.out.println("Неверный ввод. Повторите ввод количества строк");
            n = scanner.nextInt();
        }
        scanner.nextLine();

        String[][] forest = new String[n][3]; // Получение матрицы, которая будет нашим лесом
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            while (true) {
                if (line.matches("[WC.]{3}")) { // Проверка строки на правильность ввода
                    break;
                } else {
                    System.out.println("Неверный ввод. Повторите ввод строки");
                    line = scanner.nextLine();
                }
            }
            for (int j = 0; j < 3; j++) { // Перенос проверенных значений строки в строчку матрицы
                forest[i][j] = line.split("")[j];
            }
        }

        System.out.println(max( // Вызов рекурсивной функции и вывод ответа
                maxMushrooms(forest, 0, 0),
                maxMushrooms(forest, 0, 1),
                maxMushrooms(forest, 0, 2))
        );
    }

    public static int max(int a, int b, int c) { // Функция для получения максимального числа из трех переданных
        return Math.max(Math.max(a, b), Math.max(b, c));
    }

    public static int maxMushrooms(String[][] forest, int i, int j) { // Функция поиска лучшего пути с максимумом грибов
        if (i == forest.length) // Если конец леса, то останавливаемся
            return 0;
        else {
            if (forest[i][j].equals("W")) // Если заходим в куст, то останавливаемся
                return 0;
            else if (forest[i][j].equals(".")) { // Если выходим на траву, то идем дальше согласно возможным направлениям
                if (j == 0) return Math.max(
                        maxMushrooms(forest, i + 1, 0),
                        maxMushrooms(forest, i + 1, 1));
                else if (j == 2) return Math.max(
                        maxMushrooms(forest, i + 1, 1),
                        maxMushrooms(forest, i + 1, 2));
                else return max(
                            maxMushrooms(forest, i + 1, 0),
                            maxMushrooms(forest, i + 1, 1),
                            maxMushrooms(forest, i + 1, 2));
            } else { // Если выходим к грибам, то +1 и идем дальше согласно возможным направлениям
                if (j == 0) return Math.max(
                        maxMushrooms(forest, i + 1, 0) + 1,
                        maxMushrooms(forest, i + 1, 1) + 1);
                else if (j == 2) return Math.max(
                        maxMushrooms(forest, i + 1, 1) + 1,
                        maxMushrooms(forest, i + 1, 2) + 1);
                else return max(
                            maxMushrooms(forest, i + 1, 0) + 1,
                            maxMushrooms(forest, i + 1, 1) + 1,
                            maxMushrooms(forest, i + 1, 2) + 1);
            }
        }
    }
}

