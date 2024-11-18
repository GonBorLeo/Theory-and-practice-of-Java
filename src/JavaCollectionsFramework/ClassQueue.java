package JavaCollectionsFramework;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ClassQueue {
    public static void main(String[] args) {
        Person_3 person1 = new Person_3(1);
        Person_3 person2 = new Person_3(2);
        Person_3 person3 = new Person_3(3);
        Person_3 person4 = new Person_3(4);

        Queue<Person_3> people = new ArrayBlockingQueue<>(3);
//        people.add(person3);
//        people.add(person2);
//        people.add(person4);
//        people.add(person1);

        // 3 <- 2 <- 4 <- 1

//        for(Person_3 person : people)
//            System.out.println(person);
//        // метод remove достает и удаляет объект из очереди
//        System.out.println(people.remove());
//        // метод peek достает объект из очереди без его удаления
//        System.out.println(people.peek());
//
//        System.out.println(people);

        /*
            ________| Выбрасывают исключение | Возвращают специальное значение |
            Insert  |         add()          |             offer()             |
            Remove  |        remove()        |             poll()              |
            Examine |        element()       |             peek()              |
         */

        System.out.println(people.offer(person1));
        System.out.println(people.offer(person2));
        System.out.println(people.offer(person3));
        System.out.println(people.offer(person4));


    }
}
class Person_3 {
    private int id;

    public Person_3(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person_3{" +
                "id=" + id +
                '}';
    }
}
