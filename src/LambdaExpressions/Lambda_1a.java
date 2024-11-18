package LambdaExpressions;
/*
Лямбда-выражения появились в Java 8

Лямбда-выражение - (одиночная) анонимная функция, которая определена без названия
и привязки к идентификатору (проще говоря - это способ передать
какой-то кусок кода в метод и позволяют обойтись использования
без анонимных классов)

У лямбда-выражений нет собственной области видимости. Области
видимости такое же, что и у той области, где это лямбда-выражение
было создано
 */

interface Executable_1 {
    void execute();
}

class Runner_1 {
    /*
    Метод run() ожидает, что ему подадут какую-то реализацию
    интерфейса Executable, т.е какой-то класс, реализующий
    интерфейс Executable
     */
    public void run(Executable_1 e){

    }
}

class ExecutableImplementation implements Executable_1 {
    @Override
    public void execute() {
        System.out.println("Hello");
    }
}

public class Lambda_1a {
    public static void main(String[] args) {
        /*
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        });

        Thread thread = new Thread(() -> System.out.println("Hello"));
        */

        /*
        Теперь при создании объекта класса Runner и вызове метода run()
        мы должны в качестве аргумента передать реализацию интерфейса
        Executable, что можно сделать тремя способами:
            1) Отдельно создать класс, реализующий интерфейс Executable,
          и при запуске метода run() в качестве аргумента передать новый
          объект этого класса
            2) Не реализовывать этот класс отдельно, а реализовать прямо
          на месте при помощи анонимного класса
         */
        Runner_1 runner_1 = new Runner_1();

        runner_1.run(new ExecutableImplementation());
        runner_1.run(new Executable_1() {
            @Override
            public void execute() {
                System.out.println("Hello");
            }
        });
        runner_1.run(() -> System.out.println("Hello"));

        /*

         */
    }
}
