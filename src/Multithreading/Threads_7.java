package Multithreading;

/*
Методы wait() и notify() есть у любого объекта.
Они необходимы для синхронизации потоков и
с помощью них мы можем добиться паттерна producer - consumer
 */

import java.util.Scanner;

public class Threads_7 {
    public static void main(String[] args) throws InterruptedException {
        WaitAndNotify wn = new WaitAndNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}

class WaitAndNotify {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread started...");
            /*
            Метод wait() может вызываться только в пределах
            синхронизованного блока. Вне синхронизованного блока
            этот метод не имеет смысла.

            Метод wait() по умолчанию вызывается на объекте this (this.wait()).
            Если в synchronized блоке указан другой объект, то необходимо
            вызвать метод wait() явно, на необходимом объекте (например: lock1.wait())
             */
            /*
            При вызове метода wait() происходит следующее:
               1) Отдача intrinsic lock (происходит что-то вроде выхода
                  из синхронизованного блока этого потока, поэтому если
                  на этом объекте синхронизуются другие потоки, то они могут
                  перехватить intrinsic lock и продолжить свою собственную
                  работу)
               2) В текущем потоке, в котором был вызван метод wait(), мы ждем
                  пока не будет вызван метод notify() на объекте (важно то,
                  чтобы оба потока были синхронизованы на одном объекте)
            */
            /*
            Для продолжения логики после метода wait() необходимы два условия
            (обратные выше указанным):
                1) Необходимо вернуть потоку, который вызвал метод wait(),
                   intrinsic lock (возвращается только после завершения
                   synchronized блока в потоке, который вызвал метод notify())
                2) Необходимо вызвать метод notify()
             */
            /*
            Обычный метод wait() будет ждать сколь угодно долго пока где-то
            в другом потоке не будет вызван метод notify()

            Метод wait(long timeoutMillis) - этот поток будет ждать
            столько timeoutMillis, пока где-то не будет вызван метод
            notify(). Если время закончится, то поток продолжит свое
            выполнение, НО только в том случае, если intrinsic lock объекта,
            на котором вызван этот поток, будет у этого же потока
             */
            wait();

            System.out.println("Producer thread resumed...");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);

        Scanner scanner = new Scanner(System.in);

        synchronized (this) {
            System.out.println("Waiting for return key pressed");
            scanner.nextLine();
            /*
            После вызова метода notifyAll() на объекте все
            потоки, которые ждут, проснутся. Метод notify()
            пробуждает только один поток

            После выхода из synchronized блока поток, который вызвал метод wait(),
            опять получает intrinsic lock, который отдал другому потоку
            и продолжает выполнение своей логики

            Важно то, чтобы оба потока были синхронизованы
            на одном объекте
             */
            notify();

            for (int i = 10; i > -1; i--) {
                System.out.println(i);
                Thread.sleep(500);
            }
        }
    }
}
