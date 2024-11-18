package JavaCollectionsFramework;

import java.util.*;

public class ClassComparable {
    public static void main(String[] args) {
        List<Person_2> peopleList = new ArrayList<>();
        Set<Person_2> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(peopleSet);

    }

    private static void addElements(Collection collection) {
        collection.add(new Person_2(1, "Bo"));
        collection.add(new Person_2(3, "Tom"));
        collection.add(new Person_2(2, "Katy"));
        collection.add(new Person_2(4, "George"));

    }

}

/*
Для того чтобы Java понял, что наши объекты сортируемы /
на них определен какой-то порядок, мы должны в нашем классе реализовать
интерфейс Comparable (дословно - годящийся для сравнения / способный быть сравниваемым)
 */
class Person_2 implements Comparable<Person_2> {
    private int id;
    private String name;

    public Person_2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person_2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person_2 person2 = (Person_2) o;
        return id == person2.id && Objects.equals(name, person2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    /*
    Порядок сравнения описывается в методе compareTo
     */
    @Override
    public int compareTo(Person_2 o) {
//        if (this.id > o.getId()) {
//            return 1;
//        } else if (this.id < o.getId()) {
//            return -1;
//        } else return 0;

        if (this.name.length() > o.getName().length()) {
            return 1;
        } else if (this.name.length() < o.getName().length()) {
            return -1;
        } else return 0;
    }
}

