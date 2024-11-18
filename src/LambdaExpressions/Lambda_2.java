package LambdaExpressions;

/*
Использование лямбда-выражений в специальных методах, которые
оперируют на коллекциях и на массивах.
Эти методы пришли из функциональных языков программирования и
эти методы позволяют удобно, очень быстро и кратко проводить
какие-то операции над коллекциями и массивами
 */

import java.util.*;
import java.util.stream.Collectors;

public class Lambda_2 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        List<Integer> list1 = new ArrayList<>();

        fillArr(arr1);
        fillList(list1);

//        System.out.println(list1);
//        System.out.println(Arrays.toString(arr1));
//
//        Изменение массива и листа обычным способом
//
//        for (int i = 0; i < 10; i++) {
//            arr1[i] = arr1[i] * 2;
//            list1.set(i, list1.get(i) * 2);
//        }


        // map method
        /*
        stream() - статический метод в классе Arrays, который
        принимает на вход массив и на выходе выдает "поток". Лямбда
        не может сразу оперировать на массиве и ей нужно сначала
        перевести в "поток"

        Специальный метод map() позволяет легко изменять наборы данных.
        Он берет каждый элемент из набора данных и сопоставляет ему
        новый элемент. И именно это сопоставление описывается в
        качестве аргумента в виде лямбда-выражения.

        Например, в массиве [1,2,3] map() будет итерироваться по
        этому массиву и в каждом шаге итерации каждый элемент
        будет помещаться в лямбда-выражение, а то, что будет возвращаться
        из лямбда-выражения и будет новым значением этого элемента
        [1,2,3] -> [2,2,3] -> [2,4,3] -> [2,4,6]

        Метод toArray() обратно преобразует "поток" в массив
         */
        arr1 = Arrays.stream(arr1).map(a -> a * 2).toArray();
        list1 = list1.stream().map(a -> a * 2).toList();

        arr1 = Arrays.stream(arr1).map(a -> 3).toArray();
        arr1 = Arrays.stream(arr1).map(a -> a + 1).toArray();

        System.out.println(list1);
        System.out.println(Arrays.toString(arr1));

        // filter method
        /*
        Специальный метод filter() фильтрует/просеивает каждый элемент
        согласно критерию в лямбда-выражения. Тело лямбда-выражения
        возвращает true или false. Если возвращается true, то элемент
        остается в результате фильтрации
         */
        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillArr(arr2);
        fillList(list2);

        arr2 = Arrays.stream(arr2).filter(a -> a % 2 == 0).toArray();
        list2 = list2.stream().filter(a -> a % 2 == 0).toList();

        System.out.println(Arrays.toString(arr2));
        System.out.println(list2);

        // forEach method
        /*
         Специальный метод forEach() не модифицирует элементы в массиве,
         а служит для того, чтобы быстро и краткого пройтись по всем
         элементам массива
         */

        Arrays.stream(arr2).forEach(System.out::println);   // Arrays.stream(arr2).forEach(a -> System.out.println(a));
        list2.stream().forEach(System.out::println);    // list2.stream().forEach(a -> System.out.println(a));

        //  reduce method
        /*
         Специальный метод reduce() (дословно - уменьшение) берет набор данных
         и сжимает его до одного элемента

         В лямбде будет две элемента (acc, x). acc - аккумулятор, или
         проще говоря - временная переменная/счетчик, а х - переменённая,
         которая на каждой итерации внутреннего цикла равняется текущему
         элементу.
         По умолчанию acc = первому элементу массива, а итерация начинается
         со второго элемента. Если же указать начальное значение acc, то
         итерация начинается с первого элемента

         Метод getAsInt() преобразует "поток" в целое число
         */
        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        fillArr(arr3);
        fillList(list3);

        int sum = Arrays.stream(arr3).reduce((acc, b) -> acc + b).getAsInt();
        int product = list3.stream().reduce((acc, b) -> acc * b).get();

        System.out.println(sum);
        System.out.println(product);



        int[] arr4 = new int[10];
        fillArr(arr4);
        /*
        Специальные методы можно вызывать один за другим
        В примере ниже из массива arr4 сначала возвращаются нечетные
        числа, которые потом умножаются на два
         */
        arr4 = Arrays.stream(arr4).
                filter(a -> a % 2 != 0).
                map(a -> a * 2).toArray();

        System.out.println(Arrays.toString(arr4));

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);

        set = set.stream().map(a -> a * 3).collect(Collectors.toSet());
        System.out.println(set);

    }

    public static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
    }

    public static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }

    }
}
