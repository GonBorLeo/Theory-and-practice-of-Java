package EduTinkoff.JavaDeveloperAutumn2024;

import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextInt(); // Получение числа
        while (n < 1 || n > 100_000_000) {
            System.out.println("Неверный ввод. Повторите ввод числа");
            n = scanner.nextInt();
        }

        if(n == 1) {
            System.out.println(1);
        } else {
            System.out.println(inc(n, 1));
        }
    }

    public static int inc (long x, long count) {
        if (count == x)
            return 0;
        return 4 + inc(x, count + 1);
    }
}
