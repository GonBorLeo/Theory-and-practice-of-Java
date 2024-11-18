package com.intellekta;

public class SortingUtil {
    public static void sortInts(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Empty data");
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0, max; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    max = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = max;
                }
            }
        }
    }

    public static void sortDoubles(Double[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Empty data");
            return;
        }
        int arrLength = arr.length;

        for (int i = 0; i < arrLength; i++) {
            if (arr[i] == null) {
                arr[i] = arr[arrLength - 1];
                arr[arrLength - 1] = null;
                arrLength--;
            }
        }

        for (int i = 1; i < arrLength; i++) {
            for (int j = 0; j < arrLength - i; j++) {
                Double max;
                if (arr[j] > arr[j + 1]) {
                    max = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = max;
                }
            }
        }
    }
}
