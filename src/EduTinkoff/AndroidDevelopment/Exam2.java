package EduTinkoff.AndroidDevelopment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();                                      // Получение размера строк и столбцов
        int m = scanner.nextInt();
        while (true) {
            if (!(n < 1 || n > 1000) && !(m < 1 || m > 1000)) {
                break;
            } else {
                System.out.println("Неверный ввод. Повторите ввод чисел");
                n = scanner.nextInt();
                m = scanner.nextInt();
            }
        }
        System.out.println("n = " + n + " m = " + m);
        scanner.nextLine();


        int[][] matrixOld = new int[n][m];                              // Получение матрицы, которую нужно повернуть
        int listIterator = 0;
        for (int i = 0; i < n; i++) {
            List<String> listString = new ArrayList<>(List.of(scanner.nextLine().split(" ")));
            for (int j = 0; j < m; j++) {
                matrixOld[i][j] = Integer.parseInt(listString.get(listIterator++));
            }
            listIterator = 0;
            listString.clear();
        }
        System.out.println("Matrix Old: ");
        printArr(matrixOld);

        System.out.println();

        int[][] matrixNew = new int[m][n];                              // Получение перевернутой матрицы
        RotateAnyMatrix90DegreesClockwise(n, m, matrixOld, matrixNew);
        System.out.println("MatrixNew: ");
        printArr(matrixNew);

    }

    public static void RotateAnyMatrix90DegreesClockwise(int n, int m, int[][] matrixOld, int[][] matrixNew) {
        int L = 0;          // Левая граница, смещается вправо (L++)
        int B = n - 1;      // Нижняя граница, смещается вверх (В--)

        int N = 0;
        int M = 0;
        while (M < n) {
            for (int i = N; i < m; i++) {
                matrixNew[i][M] = matrixOld[B][L];
                L++;
            }
            B--;
            L = 0;
            M++;
        }
    }

    public static void RotateTheSymmetricalMatrix90DegreesClockwise(int n, int m, int[][] matrixOld, int[][] matrixNew) {
        int L = 0;          // Левая граница, смещается вправо (L++)
        int R = m - 1;      // Правая граница, смещается влево (R--)
        int T = 0;          // Верхняя граница, смещается вниз (Т++)
        int B = n - 1;      // Нижняя граница, смещается вверх (В--)

        int l = 0;          // Левая граница, смещается вправо (l++)
        int r = m - 1;      // Правая граница, смещается влево (r--)
        int t = 0;          // Верхняя граница, смещается вниз (t++)
        int b = n - 1;      // Нижняя граница, смещается вверх (b--)

//            int temp2 = 1;

        do {
            for (int j = L; j <= R; j++) {         // Верхняя строчка витка, слева направо
//                    matrixNew[T][j] = temp2++;          // Т - номер строки, j - номер столбца
                matrixNew[T][j] = matrixOld[b][L];
                b--;
            }

            for (int i = T; i <= B; i++) {      // Правая строчка витка, сверху вниз
//                    matrixNew[i][R] = temp2++;          // i - номер строки, R - номер столбца
                matrixNew[i][R] = matrixOld[T][l];
                l++;

            }
            for (int j = R; j >= L; j--) {     // Нижняя строчка витка, справа налево
//                    matrixNew[B][j] = temp2++;          // B - номер строки, j - номер столбца
                matrixNew[B][j] = matrixOld[t][R];
                t++;

            }
            for (int i = B; i > T; i--) {       // Левая строчка витка, снизу вверх
//                    matrixNew[i][L] = temp2++;          // i - номер строки, L - номер столбца
                matrixNew[i][L] = matrixOld[B][r];
                r--;
            }
            L++;
            R--;
            T++;
            B--;

            b = B;
            l = L;
            t = T;
            r = R;

        } while (L <= R);
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
