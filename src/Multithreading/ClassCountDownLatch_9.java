package Multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
CountDownLatch (дословно - защелка обратного отчета) - это класс,
при создании объекта которого мы передаем в качестве аргумента число
Это число означает сколько раз мы должны вызвать метод countDown()
из потока/потоков чтобы метод await() больше не ждал и защелка была
открыта
 */

public class ClassCountDownLatch_9 {
    public static void main(String[] args) throws InterruptedException {
        /*
        При создании объекта класса CountDownLatch необходимо
        указать количество итераций которые мы должны отчитать
        назад прежде чем "защелка" нам отопрется
        */
        CountDownLatch countDownLatch = new CountDownLatch(3);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++)
            executorService.submit(new Processor(i, countDownLatch));

        executorService.shutdown();

        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            // декрементирует переменную count на единицу
            countDownLatch.countDown();
        }
    }
}

class Processor implements Runnable {
    private CountDownLatch countDownLatch;
    private int id;

    public Processor(int id, CountDownLatch countDownLatch) {
        this.id = id;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread with id " + id + " proceeded");

    }
}
