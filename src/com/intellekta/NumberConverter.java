package com.intellekta;

public class NumberConverter {
    public static void printAll(int val){
        System.out.println(val + " in BIN: " + Long.toBinaryString(val));
        System.out.println(val + " in OCT: " + Long.toOctalString(val));
        System.out.println(val + " in HEX: " + Long.toHexString(val));
    }
}
