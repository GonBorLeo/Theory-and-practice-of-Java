package EduTinkoff.JavaDeveloperAutumn2024;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n;
        while (true) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt(); // Получение числа
                while (n < 102 || n > 1_000_000_000) {
                    System.out.println("Выход за пределы диапазона. Повторите ввод числа");
                    n = scanner.nextInt();
                }
                System.out.println(n * (n + 1) / 2 - 4950);
                break;
            }
            System.out.println("Введено что-то помимо числа. Повторите ввод");
            scanner.nextLine();



        }

    }
}
