package EduTinkoff.BackendAcademyJava2024;

import java.util.Arrays;
import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstWeek;
        String[] secondWeek;
        String[] thirdWeek;
        String[] fourthWeek;

        String line = scanner.nextLine();
        boolean breakWhile = false;

        while (!breakWhile) {
            String[] week = line.split(" ");
            if (week.length < 8) {

                int abc = Arrays.stream(line.split(" ")).filter(a -> a.contains("(MON)|(TUE)|(WED)|(THU)|(FRI)|(SAT)|(SUN)|(\\s)")).toArray().length;

                for (String day : week) {
                    if (!(day.matches("(MON)|(TUE)|(WED)|(THU)|(FRI)|(SAT)|(SUN)|(\\s)"))) {
                        System.out.println("Введены недопустимые символы. Повторите ввод недели");
                        line = scanner.nextLine();
                        break;

                    } else {
                        int MON = Arrays.stream(line.split(" ")).filter(a -> a.contains("MON")).toArray().length;
                        int TUE = Arrays.stream(line.split(" ")).filter(a -> a.contains("TUE")).toArray().length;
                        int WED = Arrays.stream(line.split(" ")).filter(a -> a.contains("WED")).toArray().length;
                        int THU = Arrays.stream(line.split(" ")).filter(a -> a.contains("THU")).toArray().length;
                        int FRI = Arrays.stream(line.split(" ")).filter(a -> a.contains("FRI")).toArray().length;
                        int SAT = Arrays.stream(line.split(" ")).filter(a -> a.contains("SAT")).toArray().length;
                        int SUN = Arrays.stream(line.split(" ")).filter(a -> a.contains("SUN")).toArray().length;

                        if (MON > 1 | TUE > 1 | WED > 1 | THU > 1 | FRI > 1 | SAT > 1 | SUN > 1) {
                            System.out.println("Введено больше одного дня недели одного значения. Повторите ввод");
                            line = scanner.nextLine();
                        } else {
                            breakWhile = true;
                        }

                    }
                }
            } else {
                System.out.println("Количество введенных дней не равно семи. Повторите ввод");
                line = scanner.nextLine();
            }

            System.out.println("end");
        }

//        while (!breakWhile) {
//            String[] week = line.split(" ");
//            if (week.length < 8) {
//                for (String day : week) {
//                    if (!(day.matches("(MON)|(TUE)|(WED)|(THU)|(FRI)|(SAT)|(SUN)|(\\s)"))) {
//                        System.out.println("Введены недопустимые символы. Повторите ввод недели");
//
//                        line = scanner.nextLine();
//
//                    } else {
//                        int MON = Arrays.stream(line.split(" ")).filter(a -> a.contains("MON")).toArray().length;
//                        int TUE = Arrays.stream(line.split(" ")).filter(a -> a.contains("TUE")).toArray().length;
//                        int WED = Arrays.stream(line.split(" ")).filter(a -> a.contains("WED")).toArray().length;
//                        int THU = Arrays.stream(line.split(" ")).filter(a -> a.contains("THU")).toArray().length;
//                        int FRI = Arrays.stream(line.split(" ")).filter(a -> a.contains("FRI")).toArray().length;
//                        int SAT = Arrays.stream(line.split(" ")).filter(a -> a.contains("SAT")).toArray().length;
//                        int SUN = Arrays.stream(line.split(" ")).filter(a -> a.contains("SUN")).toArray().length;
//
//                        if(MON > 1 | TUE > 1 | WED > 1 | THU > 1 | FRI > 1 | SAT > 1 | SUN > 1 ) {
//                            System.out.println("Введено больше одного дня недели одного значения. Повторите ввод");
//                            line = scanner.nextLine();
//                        } else {
//                            breakWhile = true;
//                        }
//
//                    }
//                }
//            } else {
//                System.out.println("Количество введенных дней не равно семи. Повторите ввод");
//                line = scanner.nextLine();
//            }
//
//            System.out.println("end");
//        }

        firstWeek = line.split(" ");

        System.out.println(Arrays.toString(firstWeek));


    }
    public static void clearArr(String[] arr){
        Arrays.fill(arr, "");
    }
}

// MON TUE WED THU FRI SAT SUN
