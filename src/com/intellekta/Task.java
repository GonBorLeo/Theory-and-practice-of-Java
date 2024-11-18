package com.intellekta;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        double[] arr = {1000.47, 1111.34, 1298.9, 1500.0, 1633.73, 1634.7, 1890.7};
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Winners: " + Arrays.toString(findAllWinners(arr)));
//        System.out.println("indexWith1500hours: " + peopleChoiceAward(arr, findAllWinners(arr).length));
        System.out.println(peopleChoiceAward(arr, 3));
    }
    /*
    enum Planes {
        BOEING(8000, 10),
        IL90(5400, 9),
        TU153(14000, 15);

        public final int distance;
        public final int time;

        Planes(int distance, int time) {
            this.distance = distance;
            this.time = time;
        }

        int speed() {
            return distance / time;
        }
    }
    public static int maxSpeed() {
        if (Planes.BOEING.speed() > Planes.IL90.speed()) {
            return Math.max(Planes.BOEING.speed(), Planes.TU153.speed());
        } else return Math.max(Planes.IL90.speed(), Planes.TU153.speed());
    }
     */

    public static double[] findAllWinners(double[] hoursOfWork) {
        if (hoursOfWork == null || hoursOfWork.length == 0) {
            return new double[0];
        }
        Arrays.sort(hoursOfWork);

        double firstPlace = Array.getDouble(hoursOfWork, hoursOfWork.length - 1); // Первое место
        int countFP = 0;
        double secondPlace = 0;
        int countSP = 0;
        double thirdPlace = 0;
        int countTP = 0;

        for (double hoursPlace : hoursOfWork) // Поиск второго места
            if (hoursPlace > secondPlace & hoursPlace < firstPlace)
                secondPlace = hoursPlace;

        for (double hoursPlace : hoursOfWork) // Поиск третьего места
            if (hoursPlace > thirdPlace & hoursPlace < secondPlace)
                thirdPlace = hoursPlace;

        for (double hoursPlace : hoursOfWork) { // Вычисление сколько людей претендует на призовые места
            if (hoursPlace == firstPlace) countFP++;
            if (hoursPlace == secondPlace) countSP++;
            if (hoursPlace == thirdPlace) countTP++;
        }

        double[] winnersWorksHours;
        winnersWorksHours = Arrays.copyOfRange(hoursOfWork, hoursOfWork.length - (countFP + countSP + countTP), hoursOfWork.length);

        return winnersWorksHours;
    }

    public static int peopleChoiceAward(double[] hoursOfWork, int countWinners) {
        if (hoursOfWork == null || hoursOfWork.length == 0 || findAllWinners(hoursOfWork).length != countWinners) {
            return -1;
        }
        Arrays.sort(hoursOfWork);
//        System.out.println("Count winners: " + countWinners);

        double[] otherWorkers = Arrays.copyOf(hoursOfWork, hoursOfWork.length - countWinners);
//        System.out.println("Other workers: " + Arrays.toString(otherWorkers));
//        System.out.println("Count other workers: " + otherWorkers.length);
        int indexWith1500hours = Arrays.binarySearch(otherWorkers, 1500);
        return (indexWith1500hours < 0) ? -1 : indexWith1500hours;
    }
}