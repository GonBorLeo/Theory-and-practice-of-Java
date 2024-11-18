package com.intellekta;

public class TypeSelector {

    public static Class<?> selectClass(Long val) {
        if (val != null) {
            if (val >= -128 & val <= 127)
                return Byte.class;
            else if (val >= -32768 & val <= 32767)
                return Short.class;
            else if (val >= -2147483648 & val <= 2147483647)
                return Integer.class;
            else
                return Long.class;
        } else
            return Object.class;
    }
}