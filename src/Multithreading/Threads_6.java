package Multithreading;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/*
Паттерн producer - consumer (Паттерн производитель - потребитель)
 */

public class Threads_6 {
    /*
        ArrayBlockingQueue - потокобезопасная очередь с указанным
        максимальным размером, ведущая себя особым образом при
        опустошении и максимальном заполнении. Настроена на работу с
        множеством потоков
     */
    static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void produce() throws InterruptedException {
        Random random = new Random();
        while (true){
            /*
            Метод put() сход с обычными методами Queue add() и offer(),
            но он не будет класть элемент в очередь и будет ждать
            пока место в очереди не освободится
             */
            queue.put(random.nextInt(100));
        }
    }

    private static void consumer() throws InterruptedException {
        while (true) {
            Thread.sleep(100);

            Random random = new Random();
            if(random.nextInt(10) == 5){
                /*
                Метод take() сход с обычными методами Queue remove() и poll(),
                но он будет ждать пока в очереди не появится хотя бы один элемент
                */
                System.out.println(queue.take());
                System.out.println("Queue size is " + queue.size());
            }

        }
    }
}
