package com.intellekta.report;

public class Reports {
    @ToRelease
    public static void report1() {
        System.out.println("report1");
    }

    @ToRelease
    @ToRelease(customerName = "Div_2")
    public static void report2() {
        System.out.println("report2");
    }

    @ToRelease
    public static void report3() {
        System.out.println("report3");
    }

    @ToRelease
    @ToRelease(customerName = "Div_2", version = 1)
    public static void report4() {
        System.out.println("report4");
    }

    @ToRelease
    @ToRelease(customerName = "Div_5", version = 5)
    public static void report5() {
        System.out.println("report5");
    }

    @ToRelease
    @ToRelease(customerName = "Div_2", version = 2)
    public static void report6() {
        System.out.println("report6");
    }

    @ToRelease
    public static void report7() {
        System.out.println("report7");
    }

    @ToRelease
    @ToRelease(customerName = "Div_2", version = 3)
    public static void report8() {
        System.out.println("report8");
    }

    @ToRelease
    public static void report9() {
        System.out.println("report9");
    }

    @ToRelease
    @ToRelease(customerName = "Div_2", version = 4)
    @ToRelease(customerName = "Div_5", version = 6)
    public static void report10() {
        System.out.println("report10");
    }

}
