package Regexp;
/*
Регулярные выражения Regexp
 */

import java.io.FilterOutputStream;

public class Regexp_1 {
    public static void main(String[] args) {

          /*
        Метод matches() вызывается на объекте класса String и
        принимает на вход строку, которая называется regex.

        Он сравнивает ту строку, которая идет ему на вход в
        качестве аргумента, со строкой, на которой вызывается.

        Возвращает true или false в зависимости от результата
        сравнения.

        String a = "qwerty";
        System.out.println(a.matches("qwerty")); // true
        System.out.println(a.matches("abcde")); // false
         */
        /*
        Метод matches() может принимать на вход не только строку,
        но и регулярные выражения:
            \\d - одна цифра
            \\w - одна буква = [a-zA-Z]

              + - 1 или более (на пустой строке выдает false)
              * - 0 или более (на пустой строке выдает true)
              ? - 0 или 1 символов до (символ, идущий до regex может мыть, а может и не быть)

      ( x | y ) - одна строка из множества строк
             [] - все возможные символы, которые могут встречаться
          [abc] = (a|b|c)
       [a-zA-Z] - все английские буквы
    [0-9] = \\d - все возможные цифры

            [^] - отрицание / всё, что идет после ^ символа не должно быть в конечном множестве)
         [^abc] - все символы кроме a, b, c
         [^a-z] - все символы кроме строчных английских букв

             . - любой символ

             {2} - только 2-х символа
             {2,} - от 2-х символов до бесконечности
             {2, 4} - от 2-х до 4-х символов

         */
        String a = "12345";
        String b = "-12345";
        String c = "+12345";
//        System.out.println(a.matches("(-|\\+)?\\d*"));
//        System.out.println(b.matches("(-|\\+)?\\d*"));
//        System.out.println(c.matches("(-|\\+)?\\d*"));

        String d1 = "g1354251";
        String d2 = "gasdf1354251";
        System.out.println(d2.matches("[a-zA-Z]\\d+"));
        System.out.println(d2.matches("[a-zA-Z]+\\d+"));

        String e1 = "hello";
        String e2 = "asdf";
//        System.out.println(e1.matches("[^abc]*"));

        String url1 = "http://www.google.com";
        String url2 = "http://www.yandex.ru";
        String url3 = "Hello there!";
//        System.out.println(url3.matches("http://www\\..+\\.(com|ru)"));

        String f = "123";
//        System.out.println(f.matches("\\d{2,}"));



    }
}
