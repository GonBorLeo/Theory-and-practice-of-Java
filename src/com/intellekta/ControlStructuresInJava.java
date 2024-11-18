package com.intellekta;

import java.util.Scanner;

public class ControlStructuresInJava {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {2, -3, 0}, {3, 2, 1}};
        int value = 2;
        boolean found = false;

        int i, j = i = -1;

        while (++i < matrix.length && !found) {
            j = -1;
            while (++j < matrix[i].length && !(found = matrix[i][j] == value)) ;
        }
        System.out.println(found ? "found at index: [" + --i + "," + j + "]" : "not found");

//        while (true) {
//            switch (getUserInput()) {
//                case 1, 4, 7:
//                    System.out.println("По вашему вопросу обратитесь в окно № 26");
//                    break;
//                case 2, 3, 5, 6:
//                    System.out.println("По вашему вопросу обратитесь в окно № 27");
//                    break;
//                case 8, 9, 10:
//                    System.out.println("По вашему вопросу обратитесь в окно № 28");
//                    break;
//                default:
//                    System.out.println("По вашему вопросу обратитесь в окно № 30");
//            }
//        }
    }

    static Scanner in = new Scanner(System.in);

    private static int getUserInput() {
        return in.nextInt();
    }

    public static void checkWeightWhile(double[] arr) {
        double sum = 0;
        int i = -1;
        while (++i < arr.length) sum += arr[i];
        System.out.println((sum / arr.length <= 0.05 * 0.90) ? "Not enough substance" : "Ok");
    }

    public static void checkWeightDoWhile(double[] arr) {
        double sum = 0;
        int i = 0;

        if (arr.length == 0) {
            System.out.println("Not enough substance");
            return;
        }

        do sum += arr[i];
        while (++i < arr.length);

        System.out.println((sum / arr.length <= 0.05 * 0.90) ? "Not enough substance" : "Ok");
    }

    public static void checkWeightFor(double[] arr) {
        boolean end = true;
        if (arr.length == 0) {
            System.out.println("Not enough substance");
            return;
        }

        for (int i = 0; i < arr.length; i += 3) {
            if (arr[i] <= 0.05 * 0.90) {
                System.out.println("Not enough substance");
                end = false;
                break;
            }
        }
        if (end) System.out.println("Ok");
    }

    public static void checkWeightForEach(double[] arr) {
        boolean end = true;
        if (arr.length == 0) {
            System.out.println("Not enough substance");
            return;
        }

        for (double x : arr) {
            if (x <= 0.05 * 0.90) {
                System.out.println(x);
                end = false;
            }
        }
        if (end) System.out.println("Ok");
    }


    public static void sayHelloIf(String[] args) {
        String userName = System.getProperty("user.name");
        String osName = System.getProperty("os.name");

        if (args.length == 0) { // Если передаваемый массив пустой
            System.out.println("Hello!");
        } else if (args.length == 1 & args[0].equals("-u")) { // Если массив из одного элемента и запрашивают пользователя
            System.out.printf("Hello, %s!", userName);
        } else if (args.length == 1 & args[0].equals("-s")) { // Если массив из одного элемента и запрашивают систему
            System.out.printf("Hello, %s!", osName);
        } else if (args.length == 2 & (args[0].equals("-u") & args[1].equals("-s") |
                (args[0].equals("-s") & args[1].equals("-u")))) { // Если массив из двух элементов и запрашивают пользователя и систему
            System.out.printf("Hello, %s of %s!", userName, osName);
        } else { // Вызов с некорректными параметрами
            System.out.println("Вызов с некорректными данными");
        }
    }

    public static void sayHelloSwitch(String[] args) {
        String userName = System.getProperty("user.name");
        String osName = System.getProperty("os.name");

        switch (args[0]) {
            case "-u": // Если запрашивают пользователя
                System.out.printf("Hello, %s!", userName);
                break;
            case "-s": // Если запрашивают систему
                System.out.printf("Hello, %s!", osName);
                break;
            case ("-us"), ("-su"): // Если запрашивают пользователя и систему
                System.out.printf("Hello, %s of %s!", userName, osName);
                break;
            default: // Если передаваемый массив пустой или был вызов с некорректными параметрами
                System.out.println("Hello!");
        }
    }

    public static void sayHelloTernary(String[] args) {
        String userName = System.getProperty("user.name");
        String str = (args.length == 1 && args[0].equals("-u")) ? String.format("Hello, %s!", userName) : "Hello!";

        System.out.println(str);
    }
}