package com.intellekta;

import java.util.*;

public class SortingAlgorithmsInJava {
    static String[] countries = new String[40000];
    static double[] sales = new double[40000];

    public static void main(String[] args) {

        Random random = new Random();
        double doub;
        String str;
        for (int i = 0; i < sales.length; i++) {
            doub = random.nextDouble(10) - 1;
            str = "String";
            countries[i] = str;
            sales[i] = doub;
        }

//        System.out.println("START " + Arrays.toString(sales));
//        System.out.println("START " + Arrays.toString(countries) + "\n");

        long timeBefore = System.currentTimeMillis();
        sortStoresSales(countries, sales);
        long timeAfter = System.currentTimeMillis();

//        System.out.println("\n" + "FINISH " + Arrays.toString(sales));
//        System.out.println("FINISH " + Arrays.toString(countries));

        System.out.println("Время выполнения сортировки равно " + (timeAfter - timeBefore));


    }

    public static void selectionSortingAlgorithm(int[] arr) {
        for (int i = 1, max, maxId; i <= arr.length; i++) {
            maxId = 0;
            max = arr[maxId];

            for (int j = 1; j <= arr.length - i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxId = j;
                }
            }

            arr[maxId] = arr[arr.length - i];
            arr[arr.length - i] = max;
        }
    }

    public static void bidirectionalSelectionSortingAlgorithm(int[] arr) {
        for (int i = 1; i <= arr.length / 2; i++) {
            int maxId = i - 1;
            int max = arr[maxId];

            int minId = i - 1;
            int min = arr[minId];

            for (int j = i; j <= arr.length - i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxId = j;
                }
                if (arr[j] < min) {
                    min = arr[j];
                    minId = j;
                }
            }

            arr[maxId] = arr[arr.length - i];
            arr[arr.length - i] = max;

            if (minId == arr.length - i) {
                minId = maxId;
            }
        }
    }

    public static void bidirectionalSortSales(String[] names, double[] data) {
        if (names.length != data.length) {
            System.out.println("Corrupted Data");
            return;
        }
        if (names.length == 0 & data.length == 0) {
            System.out.println("Empty Data");
            return;
        }
        /*
        i <= data.length / 2;

        При двунаправленном обходе массива нам необходимо остановиться на половине, так
        как зона при выходе за границы проверки значения неконтролируемо перемешиваются
         */
        for (int i = 1; i <= data.length / 2; i++) {

            /*
            int maxId = i - 1;

            Левая граница того, где мы по умолчанию забираем минимальные и максимальные
            значения также сдвигается вправо по мере перемещения нового минимального значения
            влево
             */
            int maxId = i - 1;
            double max = data[maxId];
            String namesMax = names[maxId];

            int minId = i - 1;
            double min = data[minId];
            String namesMin = names[maxId];

            /*
            Сравнение также идет на плюс одно значение правее предыдущей итерации
             */
            for (int j = i; j <= data.length - i; j++) {
                if (data[j] > max) {
                    max = data[j];
                    namesMax = names[j];
                    maxId = j;
                }
                if (data[j] < min) {
                    min = data[j];
                    namesMin = names[j];
                    minId = j;
                }
            }

            data[maxId] = data[data.length - i];
            data[data.length - i] = max;

            names[maxId] = names[names.length - i];
            names[data.length - i] = namesMax;

            if (minId == data.length - i)
                minId = maxId;

            data[minId] = data[i - 1];
            data[i - 1] = min;

            names[minId] = names[i - 1];
            names[i - 1] = namesMin;

            System.out.println(Arrays.toString(data));
            System.out.println(Arrays.toString(names));
            System.out.println();
        }
    }

    public static void sortStoresSales(String[] names, double[] data) {
        if (names.length != data.length) {
            System.out.println("Corrupted Data");
            return;
        }
        if (names.length == 0 & data.length == 0) {
            System.out.println("Empty Data");
            return;
        }

        double[] leftArrayData = new double[data.length / 2];
        double[] rightArrayData = new double[data.length - leftArrayData.length];

        String[] leftArrayNames = new String[data.length / 2];
        String[] rightArrayNames = new String[data.length - leftArrayNames.length];

        for (int i = 0; i < data.length; i++) {
            if (i < leftArrayData.length) {
                leftArrayData[i] = data[i];
                leftArrayNames[i] = names[i];
            } else {
                rightArrayData[i - leftArrayData.length] = data[i];
                rightArrayNames[i - leftArrayNames.length] = names[i];
            }
        }

        if (rightArrayData.length > 1) {
            sortStoresSales(leftArrayNames, leftArrayData);
            sortStoresSales(rightArrayNames, rightArrayData);
        }

        int leftIdData = 0;
        int rightIdData = 0;
        int leftIdNames = 0;
        int rightIdNames = 0;

        for (int i = 0; i < data.length; i++) {
            if (leftIdData == leftArrayData.length && rightIdData < rightArrayData.length) {
                data[i] = rightArrayData[rightIdData++];
                names[i] = rightArrayNames[rightIdNames++];
            } else if (rightIdData == rightArrayData.length && leftIdData < leftArrayData.length) {
                data[i] = leftArrayData[leftIdData++];
                names[i] = leftArrayNames[leftIdNames++];
            } else {
                if (leftArrayData[leftIdData] < rightArrayData[rightIdData]) {
                    data[i] = leftArrayData[leftIdData++];
                    names[i] = leftArrayNames[leftIdNames++];
                } else {
                    data[i] = rightArrayData[rightIdData++];
                    names[i] = rightArrayNames[rightIdNames++];
                }
            }
        }
        printData(names, data);
    }

    public static void bubbleSort(int[] arr) {
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

    public static void stoneSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0, max; j < arr.length - i; j++) {
                if (arr[j] <= arr[j + 1]) {
                    max = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = max;
                }
            }
        }
    }

    public static void sortSalesStoneSort(String[] names, double[] data) {
        if (names.length != data.length) {
            System.out.println("Corrupted Data");
            return;
        }
        if (names.length == 0 & data.length == 0) {
            System.out.println("Empty Data");
            return;
        }
        int arrLength = names.length;
        for (int i = 1; i < arrLength; i++) {
            for (int j = 0; j < arrLength - i; j++) {
                double maxSale;
                String maxCountry;
                if (data[j] <= data[j + 1]) {
                    maxSale = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = maxSale;

                    maxCountry = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = maxCountry;
                }
            }
            printData(names, data);
        }
        printData(names, data);
    }

    private static void printData(String[] names, double[] data) {
        System.out.print("{");
        for (int i = 0; i < data.length; i++) {
            System.out.print(names[i] + ": " + data[i] + ", ");
        }
        System.out.println("\b\b}");
    }
}
