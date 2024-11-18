package Multithreading;
/*
Прерывание потоков
 */

import java.util.Random;

public class Threads_13 {
    /*
    InterruptedException вызывается в том случае, когда какие-то методы
    выполняются в потоке, который был прерван / на котором был вызван
    метод interrupt().
     */
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i < 1_000_000_000; i++) {
                    /*
                     Как мы можем внутри потока понять хотят нас завершить
                     или нет? Для этого существует специальная конструкция.
                     currentThread() - статический метод, который возвращает
                     текущей поток, а уже на нем вызывается метод isInterrupted().
                     Таким образом в самом потоке мы можем понять, прервали нас
                     или нет.
                     Если нас прервут (в нашем случае если поток main
                     вызовет метод interrupt()), то isInterrupted() вернет true и
                     в потоке Thread мы сможем понять, что другой поток хочет, чтобы
                     мы прервали свое выполнение. И вот этом случае мы можем как-то
                     грамотно завершить сове выполнение.
                     */
                    if(Thread.currentThread().isInterrupted()) {
                        System.out.println("Thread was interrupted");
                        break;
                    };
                    Math.sin(random.nextDouble());
                }
            }
        });

        System.out.println("Starting thread");
        thread.start();

        Thread.sleep(1000);
        /*
        Метод interrupt() не останавливает поток, но мы даем потоку
        сообщение о том, что мы хотим его остановить. Поток принимает
        это сообщение и тут же мы можем как угодно обработать это сообщение
        и грамотно завершить поток
        Метод interrupt() должен вызваться до метода join()
         */
        thread.interrupt();

        thread.join();
        System.out.println("Thread has finished");
    }
}
