package EduTinkoff.AndroidDevelopment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lineOne = scanner.nextLine().split(" ");         // Получение размера матрицы и направления поворота
        int n;
        String directionOfRotation;
        while (true) {
            n = Integer.parseInt(lineOne[0]);
            directionOfRotation = lineOne[1];
            if (!(n < 1 || n > 1000) && (directionOfRotation.equals("R") || directionOfRotation.equals("L"))) {
                break;
            } else {
                System.out.println("Неверный ввод. Повторите ввод размера матрицы и направление поворота матрицы (R / L)");
                lineOne = scanner.nextLine().split(" ");
            }
        }

        int[][] matrix = new int[n][n];                              // Получение матрицы, которую нужно повернуть
        int listIterator = 0;
        for (int i = 0; i < n; i++) {
            List<String> listString = new ArrayList<>(List.of(scanner.nextLine().split(" ")));
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(listString.get(listIterator++));
            }
            listIterator = 0;
            listString.clear();
        }

        if (directionOfRotation.equals("R")){
            RotateMatrixRight(n, matrix);
        } else {
            RotateMatrixLeft(n, matrix);
        }

        scanner.close();
    }
    public static void RotateMatrixRight(int N, int[][] matrix) {
        int numberOfOperations = 0;
        List<String> coordinates = new ArrayList<>();

        for (int x = 0; x < N / 2; x++) {
            for (int y = x; y < N - x - 1; y++) {
                int temp = matrix[x][y];
                boolean EQUALS_1;
                boolean EQUALS_2 = (matrix[x][y] == matrix[N - 1 - x][N - 1 - y]) && (matrix[N - 1 - y][x] == matrix[y][N - 1 - x]);
                int temp2 = matrix[y][N - 1 - x];

                int temp1 = matrix[x][y];
                EQUALS_1 = matrix[N - 1 - y][x] != temp2;
                temp2 = matrix[x][y];
                matrix[x][y] = matrix[N - 1 - y][x]; // 0 0 <- 1 0
                if (matrix[x][y] != temp1 && (EQUALS_1 | EQUALS_2)) {
                    numberOfOperations++;
                    coordinates.add((N - 1 - y) + " " + x + " -> " + x + " " + y);
//                    System.out.println("1");
                }

                temp1 = matrix[N - 1 - y][x];
                EQUALS_1 = matrix[N - 1 - x][N - 1 - y] != temp2;
                temp2 = matrix[N - 1 - y][x];
                matrix[N - 1 - y][x] = matrix[N - 1 - x][N - 1 - y]; // 1 0 <- 1 1
                if (matrix[N - 1 - y][x] != temp1 && EQUALS_1) {
                    numberOfOperations++;
                    coordinates.add((N - 1 - x) + " " + (N - 1 - y) + " -> " + (N - 1 - y) + " " + x);
//                    System.out.println("2");
                }

                temp1 = matrix[N - 1 - x][N - 1 - y];
                EQUALS_1 = matrix[y][N - 1 - x] != temp2;
                temp2 = matrix[N - 1 - x][N - 1 - y];
                matrix[N - 1 - x][N - 1 - y] = matrix[y][N - 1 - x]; // 1 1 <- 0 1
                if (matrix[N - 1 - x][N - 1 - y] != temp1 && (EQUALS_1 | EQUALS_2)) {
                    numberOfOperations++;
                    coordinates.add(y + " " + (N - 1 - x) + " -> " + (N - 1 - x) + " " + (N - 1 - y));
//                    System.out.println("3");
                }

                temp1 = matrix[y][N - 1 - x];
                EQUALS_1 = temp != temp2;
                temp2 = matrix[y][N - 1 - x];
                matrix[y][N - 1 - x] = temp; // 0 1 <- 0 0
                if (matrix[y][N - 1 - x] != temp1 && EQUALS_1) {
                    numberOfOperations++;
                    coordinates.add(x + " " + y + " -> " + y + " " + (N - 1 - x));
//                    System.out.println("4");
                }
            }
        }
//        System.out.println("Matrix after turning to the right:");
//        printArr(matrix);
//        System.out.println();

        System.out.println("Number of operations = " + numberOfOperations);
        coordinates.stream().forEach(System.out::println);
    }

    public static void RotateMatrixLeft(int N, int[][] matrix) {
        int numberOfOperations = 0;
        List<String> coordinates = new ArrayList<>();

        for (int x = 0; x < N / 2; x++) {
            for (int y = x; y < N - x - 1; y++) {
                int temp = matrix[x][y];
                boolean EQUALS_1;
                boolean EQUALS_2 = (matrix[x][y] == matrix[N - 1 - x][N - 1 - y]) && (matrix[N - 1 - y][x] == matrix[y][N - 1 - x]);
                int temp2 = matrix[N - 1 - x][y];

                int temp1 = matrix[x][y];
                EQUALS_1 = matrix[y][N - 1 - x] != temp2;
                temp2 = matrix[x][y];
                matrix[x][y] = matrix[y][N - 1 - x]; // 0 0 <- 0 1
                if (matrix[x][y] != temp1 && (EQUALS_1 | EQUALS_2)) {
                    numberOfOperations++;
                    coordinates.add(x + " " + (N - 1 - y) + " -> " + x + " " + y);
//                    System.out.println("1");
                }

                temp1 = matrix[y][N - 1 - x];
                EQUALS_1 = matrix[N - 1 - x][N - 1 - y] != temp2;
                temp2 = matrix[y][N - 1 - x];
                matrix[y][N - 1 - x] = matrix[N - 1 - x][N - 1 - y]; // 0 1 <- 1 1
                if (matrix[y][N - 1 - x] != temp1 && EQUALS_1) {
                    numberOfOperations++;
                    coordinates.add((N - 1 - x) + " " + (N - 1 - y) + " -> " + x + " " + (N - 1 - y));
//                    System.out.println("2");
                }

                temp1 = matrix[N - 1 - x][N - 1 - y];
                EQUALS_1 = matrix[N - 1 - y][x] != temp2;
                temp2 = matrix[N - 1 - x][N - 1 - y];
                matrix[N - 1 - x][N - 1 - y] = matrix[N - 1 - y][x]; // 1 1 <- 1 0
                if (matrix[N - 1 - x][N - 1 - y] != temp1 && (EQUALS_1 | EQUALS_2)) {
                    numberOfOperations++;
                    coordinates.add((N - 1 - x) + " " + y + " -> " + (N - 1 - x) + " " + (N - 1 - y));
//                    System.out.println("3");
                }

                temp1 = matrix[N - 1 - y][x];
                EQUALS_1 = temp != temp2;
                temp2 = matrix[N - 1 - y][x];
                matrix[N - 1 - y][x] = temp; // 1 0 <- 0 0
                if (matrix[N - 1 - y][x] != temp1 && EQUALS_1) {
                    numberOfOperations++;
                    coordinates.add(x + " " + y + " -> " + (N - 1 - x) + " " + y);
//                    System.out.println("4");
                }
            }
        }
//        System.out.println("Matrix after turning to the left:");
//        printArr(matrix);
//        System.out.println();

        System.out.println("Number of operations = " + numberOfOperations);
        coordinates.stream().forEach(System.out::println);

    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
