package Multithreading;

/*
Ключевое слово volatile (дословно - изменчивый, подверженный изменению)
(необходимо, когда одна переменная делится на
несколько потоков - один ПИШЕТ (ИЗМЕНЯЕТ ЗНАЧЕНИЕ),
а другой/другие ЧИТАЕТ/ЮТ из этой переменной
 */

import java.util.Scanner;

public class Threads_2 {
    public static void main(String[] args) {
        MyThread_2 myThread_2 = new MyThread_2();
        myThread_2.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread_2.shutdown();
    }
}

class MyThread_2 extends Thread {
    /*
    При пометке переменной словом volatile мы даем понять,
    что эта переменная может быть изменена и теперь переменная
    не будет кэшироваться для каждого ядра
    (решает проблему когерентности кэшей)
     */
    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}
