package EduTinkoff.AndroidDevelopment;

import java.util.Arrays;
import java.util.Scanner;

public class Exam6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Получение числа, обозначающего размер шахматной доски
        while (n < 2 || n > 100) {
            System.out.println("Размер шахматной доски не входит в допустимый диапазон. Повторите ввод");
            n = scanner.nextInt();
        }
        scanner.nextLine();

        String[][] chessboard = new String[n][n]; // Получение пустой матрицы, которая будет нашей шахматной доской

        boolean letterS = false; // Переменная для проверки наличия начальной клетки
        boolean letterF = false; // Переменная для проверки наличия конечной клетки

        int xStart = 0; // X-координата начальной клетки
        int yStart = 0; // Y-координата начальной клетки

        // Заполнение пустой шахматной доски
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();

            while (true) {
                if (line.length() == n) {                                                       // Проверка строки на количество вводимых элементов
                    if (line.matches("[KG.SF]+")) {                                       // Проверка строки на правильность ввода
                        if ((line.contains("S") & letterS) || (line.contains("F") & letterF)) { // Проверка строки на повторный ввод начальной и конечной клеток
                            System.out.println("Начальная/конечная клетка уже была введена. Повторите ввод строки");
                            line = scanner.nextLine();
                        } else {
                            int S = Arrays.stream(line.split("")).filter(a -> a.contains("S")).toArray().length;
                            int F = Arrays.stream(line.split("")).filter(a -> a.contains("F")).toArray().length;
                            if (S >= 2 || F >= 2) {                                             // Проверка строки на то, что в ней не более одной начальной/конечной клетки
                                System.out.println("В вводимой строке больше одной начальной/конечной клетки. Повторите ввод строки");
                                line = scanner.nextLine();
                            } else {
                                if (line.contains("S"))                                         // Если во введенной строке есть начальная клетка, проверочная переменная меняет значение на true
                                    letterS = true;
                                if (line.contains("F"))                                         // Если во введенной строке есть начальная клетка проверочная переменная меняет значение на true
                                    letterF = true;
                                break;                                                          // Выход из цикла проверки
                            }
                        }
                    } else {
                        System.out.println("Введены недопустимые символы. Повторите ввод строки");
                        line = scanner.nextLine();
                    }
                } else {
                    System.out.println("Число введенных клеток больше/меньше ширины доски. Повторите ввод строки");
                    line = scanner.nextLine();
                }
            }
            String[] lineArr = line.split("");
            for (int j = 0; j < n; j++) {                                                       // Перенос проверенных значений строки в строчку матрицы
                chessboard[i][j] = lineArr[j];
                if (chessboard[i][j].equals("S")) {
                    xStart = i;
                    yStart = j;
                }
            }
        }

        System.out.println("Размер шахматной доски - " + n + "\n"); // Вывод размера матрицы
        printArr(chessboard); // Вывод матрицы
        System.out.println();

        System.out.println("Минимальное число ходов = " + findExit(chessboard, xStart, yStart, "K")); // Главная функция
    }

    public static int findExit(String[][] cb, int x, int y, String figure) {
        if (x > cb.length - 1 || x < 0 || y > cb.length - 1 || y < 0) {  // Если текущие координаты находятся за пределами шахматной доски
            return 9999999;
        } else switch (cb[x][y]) {
            case "x" -> { return 9999999; }                      // Если клетка уже была посещена
            case "F" -> { return 0; }                            // Если дошли до конечной клетки
            case "G" -> { return king(cb, x, y); }               // Если на текущей клетке стоит король
            case "K" -> { return horse(cb, x, y); }              // Если на текущей клетке стоит конь
            default -> {                                         // Если на клетке нет фигуры или клетка является начальной
                if (figure.equals("G")) return king(cb, x, y);      // Если предыдущая фигура - король
                else return horse(cb, x, y);                        // Если предыдущая фигура - конь
            }
        }
    }

    public static int king(String[][] cb, int x, int y) {
        cb[x][y] = "x"; // Текущая клетка будет считаться пройденной
        String[][] newCb = Arrays.stream(cb).map(String[]::clone).toArray(String[][]::new); // Создание копии матрицы с предыдущими ходами

        int a = 1 + findExit(newCb, x - 1, y, "G");         // вверх
        int b = 1 + findExit(newCb, x - 1, y + 1, "G");  // вверх и вправо
        int c = 1 + findExit(newCb, x, y + 1, "G");         // вправо
        int d = 1 + findExit(newCb, x + 1, y + 1, "G");  // вниз и вправо
        int e = 1 + findExit(newCb, x + 1, y, "G");         // вниз
        int f = 1 + findExit(newCb, x + 1, y - 1, "G");  // вниз влево
        int j = 1 + findExit(newCb, x, y - 1, "G");         // влево
        int k = 1 + findExit(newCb, x - 1, y - 1, "G");  // вверх и влево

        int[] minCount = {a, b, c, d, e, f, j, k}; // Поиск минимального количества ходов среди всех возможных восьми направлений
        Arrays.sort(minCount);

        return (minCount[0] > 10000) ? -1 : minCount[0];
    }

    public static int horse(String[][] cb, int x, int y) {
        cb[x][y] = "x";
        String[][] newCb = Arrays.stream(cb).map(String[]::clone).toArray(String[][]::new);

        int a = 1 + findExit(newCb, x - 2, y + 1, "K"); // вверх и вправо
        int b = 1 + findExit(newCb, x - 1, y + 2, "K"); // вправо и вверх
        int c = 1 + findExit(newCb, x + 1, y + 2, "K"); // вправо и вниз
        int d = 1 + findExit(newCb, x + 2, y + 1, "K"); // вниз и вправо
        int e = 1 + findExit(newCb, x + 2, y - 1, "K"); // вниз и влево
        int f = 1 + findExit(newCb, x + 1, y - 2, "K"); // влево и вниз
        int j = 1 + findExit(newCb, x - 1, y - 2, "K"); // влево и вверх
        int k = 1 + findExit(newCb, x - 2, y - 1, "K"); // вверх и влево

        int[] minCount = {a, b, c, d, e, f, j, k};
        Arrays.sort(minCount);

        return (minCount[0] > 10000) ? -1 : minCount[0];
    }

    public static void printArr(String[][] arr) {
        for (String[] strings : arr) {
            for (String string : strings) {
                System.out.print(string + "\t");
            }
            System.out.println();
        }
    }
}