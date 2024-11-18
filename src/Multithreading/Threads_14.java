package Multithreading;

import java.util.Random;
import java.util.concurrent.*;

/*
Слова Callable и Future используются для получения значений из потока

 */
public class Threads_14 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        /*
        Если есть необходимость в возврате из метода какого-либо
        значения, вместо интерфейса Runnable можно использовать
        интерфейс Callable, в параметре которого указывается тип
        возвращаемого значения
         */
        /*
        При переводе анонимного класса в лямбда-функцию она
        выглядит ровно также, как и лямбда выражения с интерфейсом
        Runnable. Java сама понимает какой интерфейс мы используем
        потому, возвращаем мы что либо или нет

        executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {

                System.out.println("Starting");
                Thread.sleep(3000);
                System.out.println("Finished");

                return 5;
            }
        });
         */
        /*
        Для того, чтобы получить доступ к возвращаемому из потока
        значению необходимо воспользоваться интерфейсом Future

        Переменная интерфейса Future параметризуется тем же типом,
        что и интерфейс Callable

        В нашем случаем мы ожидаем, что когда наш поток завершит свое
        выполнение, он вернет целое число и именно это значение будет
        лежать в переменной future интерфейса Future типа <Integer>
         */
        Future<Integer> future = executorService.submit(() -> {

            System.out.println("Starting");
            Thread.sleep(500);
            System.out.println("Finished");

            Random random = new Random();
            int randomValue = random.nextInt(10);

            if (randomValue < 5) {
                throw new Exception("Something bad happened");
            }

            return randomValue;
        });

        executorService.shutdown();

        /*
        Метод get() служит для получения значения, которое возвращается
        из потока (выбрасывает InterruptedException и ExecutionException)

        Метод get() дожидаться окончания выполнения потока
         */

        try {
            int result = future.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            /*
            При возникновении исключения в выполняемом потоке
            мы можем поймать это исключение в главном потоке и
            как-то обработать

            Метод getCause() позволяет получить причину исключения
            Метод getCause() позволяет получить сообщение исключения
             */
            Throwable ex = e.getCause();
            System.out.println(ex.getMessage());
        }


    }
}
