package EduTinkoff.AndroidDevelopment;

import java.util.*;

public class Exam3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDirectories = scanner.nextInt(); // Получение числа, обозначающего количество директорий
        while (true) {
            if (!(numberOfDirectories < 1 || numberOfDirectories > 100_000)) {
                break;
            } else {
                System.out.println("Неверный ввод. Повторите ввод количества директорий");
                numberOfDirectories = scanner.nextInt();
            }
        }
        scanner.nextLine();

        String[] allDirectories = new String[numberOfDirectories];  // Получение массива директории
        boolean isEmpty = true;
        while (isEmpty) {
            for (int i = 0; i < numberOfDirectories; i++) {
                String directory = scanner.nextLine();
                if (directory.matches("([a-z]{1,10}/)*?[a-z]{1,10}")) { // Проверка на правильность ввода с учетом слэша
                    allDirectories[i] = directory;
                } else {
                    System.out.println("Неверный ввод директория. Повторите ввод");
                    Arrays.fill(allDirectories, null);
                    break;
                }
            }

            if (allDirectories[0] != null) {
                Arrays.sort(allDirectories);
                for (int i = 1; i < numberOfDirectories; i++) {
                    if (!allDirectories[i].startsWith(allDirectories[0])) { // Проверка на правильность ввода с учетом того, что корневой директорий у всех одинаковый
                        System.out.println("Неверный ввод директория. Повторите ввод");
                        Arrays.fill(allDirectories, null);
                        break;
                    }
                }
            }

            if (allDirectories[0] != null) {
                isEmpty = false;
            }
        }

        System.out.println(allDirectories[0]);
        int n = 2;
        for (int i = 1; i < allDirectories.length; i++) {
            Set<String> set1 = new HashSet<>(List.of(allDirectories[i - 1].split("/")));
            Set<String> set2 = new HashSet<>(List.of(allDirectories[i].split("/")));

            set2.removeAll(set1);
            if (set2.isEmpty()) {
                n = 2;
                set1 = new HashSet<>(List.of(allDirectories[0].split("/")));
                set2 = new HashSet<>(List.of(allDirectories[i].split("/")));
                set2.removeAll(set1);
            }
            System.out.print(set2.iterator().next().indent(n));
            n = n + 2;
        }

        System.out.println("Number of directories = " + numberOfDirectories);
        System.out.println("All directories: " + Arrays.toString(allDirectories));
    }
}