package Regexp;

import java.util.Arrays;

public class Regexp_2 {
    public static void main(String[] args) {
        String a = "Hello12412there534532hey";

        String[] words = a.split("\\d+");
        System.out.println(Arrays.toString(words));

        String b = "Hello there hey";

        String modifiedString1 = b.replace(" ", ".");
        System.out.println(modifiedString1);

        String modifiedString2 = b.replaceFirst(" ", "-");
        System.out.println(modifiedString2);
    }
}
