package JavaCollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClassComparator {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("frog");
        animals.add("cat");
        animals.add("bird");
        animals.add("tiger");
        animals.add("chicken");
        Collections.sort(animals);
        System.out.println(animals);
        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(500);
        numbers.add(5);
        numbers.add(100);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                } else if (o1 < o2) {
                    return 1;
                } else return 0;
            }
        });
        System.out.println(numbers);

        List<Person_1> people = new ArrayList<>();
        people.add(new Person_1(1, "Bob"));
        people.add(new Person_1(3, "Mike"));
        people.add(new Person_1(2, "Katy"));
        Collections.sort(people, new Comparator<>() {
            @Override
            public int compare(Person_1 o1, Person_1 o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                } else return 0;
            }
        });
        System.out.println(people);


    }
}

/*
    Если нас не устраивает естественный порядок
    сортировки, то мы можем создать новый класс, который
    будет реализовывать интерфейс Comparator (дословно - тот, кто сравнивает),
    а в реализации можем указать ту логику, по которой мы
    хотим сортировать наши объекты в наших коллекциях,
    а уже эту логику можем приметить к нашим коллекциям
     */
class StringLengthComparator implements Comparator<String> {

    @Override
        /*
            Метод compare возвращает целое число
            которому Java понимает какой из объектов
            больше или меньше второго:
            о1 > o2 => 1
            o1 < o2 => -1
            o1 == o2 => 0

            compare(7, 5) => 1
            compare(5, 7) => -1
            compare(5, 5) => 0
         */
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else return 0;
    }
}

class Person_1 {
    private int id;
    private String name;

    public Person_1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}