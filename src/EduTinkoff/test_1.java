package EduTinkoff;

import java.util.Scanner;

public class test_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");

        checkLine(line, scanner);
        System.out.println(finalPriceFoTInternet(
                        Integer.parseInt(line[0]),
                        Integer.parseInt(line[1]),
                        Integer.parseInt(line[2]),
                        Integer.parseInt(line[3])
                )
        );
        scanner.close();
    }

    public static String[] checkLine(String[] line, Scanner scanner) {
        boolean lineIsCorrect = false;
        while (!lineIsCorrect) {
            if (line.length != 4) {
                System.out.println("Неверный ввод (количество введенных символов не равно четырем)");
                line = scanner.nextLine().split(" ");

            } else {
                boolean isnumbers = true;

                for (int i = 0; i < line.length; i++) {
                    try {
                        Integer.parseInt(line[i]);
                    } catch (NumberFormatException e) {
                        isnumbers = false;
                        System.out.println("Неверный ввод (введите только числа)");
                        line = scanner.nextLine().split(" ");
                        break;
                    }
                }
                if (isnumbers) lineIsCorrect = true;
            }
        }
        return line;
    }

    public static int finalPriceFoTInternet(int A, int B, int C, int D) {
        if (D <= B) {
            return A;
        } else {
            return (A + (D - B) * C);
        }
    }
}