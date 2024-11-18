package Multithreading;
/*
    Thread-pull - пулл потоков
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Threads_5 {
    public static void main(String[] args) throws InterruptedException {
        /*
        Создание Thread-pull = ExecutorService - сервис по выполнению
        В данном случае создается пулл потоков при помощи статического
        метода newFixedThreadPool класса Executors, который возвращает ExecutorService
         */
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            /*
             Метод submit() служит для передачи задач пулу потоков

             В метод submit() мы должны подставить объект класса, реализующий
             интерфейс Runnable, в методе run() которого будет описана вся логика,
             которая будет выполняться в потоке
             */
            executorService.submit(new Work(i));
        }



        /*
        Метод shutdown() обозначает прекращение передачу новых заданий

        shutdown() ~ start()
         */
        executorService.shutdown();
        System.out.println("All tasks submitted");

        /*
        Метод awaitTermination() указывает предел ожидания выполнения
        задач потоками

        awaitTermination() ~ join()
         */
        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}

class Work implements Runnable {
    private int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Work " + id + " was completed");
    }
}
