import java.util.Arrays;

public class WorkingWithMatrices {
    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int[][] arr = new int[n][m];

        // Отзеркаливание матрицы по диагонали
        /*
        int temp;
        int[][] arr2 = new int[n][m];
        fillTheArray(arr2);
        printArr(arr2);
        System.out.println();
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                temp = arr2[i][j];
                arr2[i][j] = arr2[j][i];
                arr2[j][i] = temp;
            }
        }
        printArr(arr2);
         */

        // Заполнение матрицы по спирали
        /*
        int[][] arr3 = new int[n][m];

        int L = 0;
        int R = m - 1;
        int T = 0;
        int B = n - 1;

        int temp2 = 1;

        do {
            for (int j = L; j <= R; j++) {
                arr3[T][j] = temp2++;
            }
            for (int i = T + 1; i <= B; i++) {
                arr3[i][R] = temp2++;
            }
            for (int j = R - 1; j >= L; j--) {
                arr3[B][j] = temp2++;
            }
            for (int i = B - 1; i > T; i--) {
                arr3[i][L] = temp2++;
            }
            L++;
            R--;
            T++;
            B--;

        } while (L <= R);
        printArr(arr3);
         */

        //Заполнение матрицы по столбцам
        /*
        int[][] arr4 = new int[n][m];
        int N = 0;
        int M = 0;
        int temp = 1;
        while (M < m ) {
            for (int i = N; i < n; i++) {
                arr4[i][M] = temp++;
            }
            M++;
        }
        printArr(arr4);
         */

        //Поворот матрицы на 90 градусов по часовой стрелке
        /*
        int[][] arrOld = new int[n][m];
        fillTheArray(arrOld);
        printArr(arrOld);

        System.out.println();

        int L = 0;          // Левая граница, смещается вправо (L++)
        int B = n - 1;      // Нижняя граница, смещается вверх (В--)

        int[][] arrNew = new int[m][n];
        int N = 0;
        int M = 0;
        while (M < n) {
            for (int i = N; i < m; i++) {
                arrNew[i][M] = arrOld[B][L];
                L++;
            }
            B--;
            L = 0;
            M++;
        }
        printArr(arrNew);
         */

        //Копирование матрицы в одну строчку
        /*
        int[][] copy = Arrays.stream(arr).map(int[]::clone).toArray(int[][]::new);
         */
    }

    // Стандартный способ заполнения матрицы
    public static void fillTheArray(int[][] arr) {
        int temp = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = temp++;
            }
        }
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
