package Multithreading;

/*
    Ключевое слово synchronized позволяет решить проблему синхронизации
    работы двух потоков при их одновременной записи в одну переменную
 */

public class Threads_3 {
    private int counter;

    public static void main(String[] args) {
        Threads_3 test = new Threads_3();
        /*
         Синхронизация происходит всегда на объекте, т.к. у любого объекта
         существует т.н. "монитор", который в один момент времени
         может быть только у одного потока
         */
        test.doWork();
    }

    /*
     synchronized в один момент времени позволяет
     обращаться к телу метода только одному потоку.
     В таком синтаксисе метод вызывается на объекте this.
     */
    public synchronized void increment() {
        counter++;
    }

    public void doWork() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment(); // counter++; // неатомарная операция: counter = counter + 1
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            /*
            Чтобы в текущем потоке дождаться выполнения других потоков,
            существует метод join(). Тот поток, в котором выполняется метод,
            ожидает завершения потоков, которые вызвали метод join()
             */
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter);
    }
}
