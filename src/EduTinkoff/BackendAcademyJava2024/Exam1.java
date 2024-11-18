package EduTinkoff.BackendAcademyJava2024;

import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Получение числа, количество шкафов
        while (n < 1 || n > 10_000_000) {
            System.out.println("Неверный ввод. Повторите ввод числа шкафов");
            n = scanner.nextInt();
        }
        scanner.nextLine();

        String line = scanner.nextLine();
        long[] wardrobesWithSocksNumbers = new long[n];
        boolean breakwhile = false;

        while (!breakwhile) {
            String[] wardrobesWithSocksString = line.split(" ");
            if (wardrobesWithSocksString.length != n) {
                System.out.println("Неверный ввод. Число введенных элементов не соответствует общему числу шкафов");
                line = scanner.nextLine();
            } else {
                boolean parseLong = true;
                for (int i = 0; i < wardrobesWithSocksString.length; i++) {
                    try {
                        wardrobesWithSocksNumbers[i] = Long.parseLong(wardrobesWithSocksString[i]);
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный ввод. Был произведен ввод значений помимо чисел");
                        parseLong = false;
                        break;
                    }
                }
                if (!parseLong) {
                    line = scanner.nextLine();
                } else {
                    for (long wardrobesWithSocksNumber : wardrobesWithSocksNumbers) {
                        if (wardrobesWithSocksNumber < 0 || wardrobesWithSocksNumber > 1_000_000_000_000_000_000L) {
                            System.out.println("Неверный ввод. В шкафу не может быть такое число носков");
                            line = scanner.nextLine();
                        } else {
                            breakwhile = true;
                        }
                    }
                }
            }
        }
        long sum = 0;
        for (long wardrobesWithSocksNumber : wardrobesWithSocksNumbers) {
            sum += wardrobesWithSocksNumber;
        }

//        System.out.println(n);
//        System.out.println(Arrays.toString(wardrobesWithSocksNumbers));
//        System.out.println(sum);

        if (sum % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
