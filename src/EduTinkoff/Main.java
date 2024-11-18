package EduTinkoff;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

    }

    public static void replace(String strOld) {
        if (strOld == null) {
            System.out.println("String in null");
            return;
        }
        System.out.println(strOld.isEmpty() ? "String is empty" : strOld.replace("*", ""));
    }

    public static void sort(int[][] matrix) {
        if (matrix == null) {
            System.out.println("Empty data");
            return;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == null) {
                System.out.println("Empty data at index " + i);
                return;
            }
            if (matrix[i].length != 3) {
                System.out.println("Unavailable data at index " + i);
                return;
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - i; j++) {
                int[] max;
                if (matrix[j][0] > matrix[j + 1][0]) {
                    max = matrix[j];
                    matrix[j] = matrix[j + 1];
                    matrix[j + 1] = max;
                }
            }
        }
    }

    static void mergeSort(int[] array) {
        int[] leftArray = new int[array.length / 2];
        int[] rightArray = new int[array.length - leftArray.length];

        for (int i = 0; i < array.length; i++) {
            if (i < leftArray.length)
                leftArray[i] = array[i];
            else
                rightArray[i - leftArray.length] = array[i];
        }

        if (rightArray.length > 1) {
            mergeSort(leftArray);
            mergeSort(rightArray);
        }

        int leftId = 0;
        int rightId = 0;

        for (int i = 0; i < array.length; i++) {
            if (leftId == leftArray.length && rightId < rightArray.length)
                array[i] = rightArray[rightId++];
            else if (rightId == rightArray.length && leftId < leftArray.length)
                array[i] = leftArray[leftId++];
            else
                array[i] = (leftArray[leftId] < rightArray[rightId]) ? leftArray[leftId++] : rightArray[rightId++];
        }
    }

    public static void shuffleArray(int[] array) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = array.length - 1; i > 0; i--) {
            int j = rnd.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
