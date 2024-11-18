package Multithreading;

// Создание потока

public class Threads_1 {
    public static void main(String[] args) {

// Первый способ создания потока
        MyThread_1 myThread_1 = new MyThread_1();
        myThread_1.start(); // Именно метод start() создает новый поток и выполняет то, что написано в методе run()

// Второй способ создания потока
        Thread thread = new Thread(new Runner());
        thread.start();

        System.out.println("Привет из main Thread");

    }
}

/*
    Первый способ - унаследование от класса Thread,
    переопределение метода run(),
    вызов метода start() в главном потоке
 */
class MyThread_1 extends Thread {
    // В методе run() описываем код, который будет выполняться этим потоком
    public void run() {
        for (int i = 0; i < 100; i++){
            try {
                Thread.sleep(1000); // Статический метод sleep(), при вызове
                                          // поток засыпает на указанное время в миллисекундах
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Привет из класса MyThread " + i);
        }
    }
}

/*
    Второй способ - создание класса и
    реализация в нем интерфейса Runnable,
    реализация в методе run() всей логики,
    передача объекта этого класса в качестве аргумента
    в конструктор при создании нового Thread'a
    и вызов метода start() в главном потоке
 */
class Runner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Привет из класса MyThread " + i);
        }
    }
}
