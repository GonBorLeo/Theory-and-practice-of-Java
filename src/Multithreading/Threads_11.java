package Multithreading;

/*
Класс Semaphore используется в том случае, когда есть некий ресурс и нам
необходимо ограничить доступ к этому ресурсу
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Threads_11 {
    public static void main(String[] args) throws InterruptedException {
        /*
            В аргументы конструктора класса Semaphore передается число, которое
            обозначает количество разрешений для потоков

                Semaphore semaphore = new Semaphore(3);


            Метод acquire() вызывается, когда в потоке начинается взаимодействие
            с ресурсом
            Поток, вызвавший метод acquire() будет ждать, если нет свободных разрешений

                try {
                    semaphore.acquire();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


            Метод release() отпускает/отдает одно из разрешений
            Метод release() вызывается, когда в потоке заканчиваем использовать
            ресурс

                semaphore.release();


            Метод acquire() возвращает количество разрешений, которые в
            момент времени свободны

                System.out.println(semaphore.availablePermits());
         */

        ExecutorService executorService = Executors.newFixedThreadPool(200);

        Connection connection = Connection.getConnection();
        for (int i = 0; i < 200; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.work();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);

        System.out.println("На момент окончания работы = " + connection.getConnectionsCount());
    }
}

/*
Такой паттерн в программировании называется "Singleton" - c помощью такого
класса мы гарантируем, что всего один раз будет создан объект нашего класса
и только он будет использоваться, а другие не будут созданы
 */
class Connection {
    private static Connection connection = new Connection();
    private int connectionsCount;
    private Semaphore semaphore = new Semaphore(10);

    public int getConnectionsCount() {
        return connectionsCount;
    }

    public void setConnectionsCount(int connectionsCount) {
        this.connectionsCount = connectionsCount;
    }

    /*
        Приватный конструктор иногда используется. Например, в тех случаях,
        когда нужно дать пользователю понять, что он не можем создавать сколько
        угодно объектов этого класса, а может использовать только одним
         */
    private Connection() {
    }

    public static Connection getConnection() {
        return connection;
    }

    public void work() throws InterruptedException {
        semaphore.acquire();
        try {
            doWork();
        } finally {
            semaphore.release();
        }


    }

    private void doWork() throws InterruptedException {
        synchronized (this) {
            connectionsCount++;
            System.out.println(connectionsCount);
        }

        Thread.sleep(5000);

        synchronized (this) {
            connectionsCount--;
        }
    }
}
