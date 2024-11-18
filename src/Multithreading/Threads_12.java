package Multithreading;

/*
Deadlock (взаимная блокировка)
 */

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//public class Threads_12 {
//    public static void main(String[] args) throws InterruptedException {
//        Runner_1 runner = new Runner_1();
//
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                runner.firstThread();
//            }
//        });
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                runner.secondThread();
//            }
//        });
//
//        thread1.start();
//        thread2.start();
//
//        thread1.join();
//        thread2.join();
//
//        runner.finished();
//
//    }
//}
//
//class Runner_1 {
//    private Account account1 = new Account();
//    private Account account2 = new Account();
//
//    public void firstThread() {
//        Random random = new Random();
//
//        for (int i = 0; i < 10000; i++) {
//            synchronized (account1) {
//                synchronized (account2) {
//                    Account.transfer(account1, account2, random.nextInt(100));
//                }
//            }
//        }
//    }
//
//    public void secondThread() {
//        Random random = new Random();
//        for (int i = 0; i < 10000; i++) {
//            synchronized (account1) {
//                synchronized (account2) {
//                    Account.transfer(account2, account1, random.nextInt(100));
//                }
//            }
//        }
//    }
//
//    public void finished() {
//        System.out.println(account1.getBalance());
//        System.out.println(account2.getBalance());
//        System.out.println("Total balance = " +
//                (account1.getBalance() + account2.getBalance()));
//    }
//}
//
//class Account {
//    private int balance = 10000;
//
//    public void deposit(int amount) {
//        balance += amount;
//    }
//
//    public void withdraw(int amount) {
//        balance -= amount;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
//
//    public static void transfer(Account acc1, Account acc2, int amount) {
//        acc1.withdraw(amount);
//        acc2.deposit(amount);
//    }
//}

public class Threads_12 {
    public static void main(String[] args) throws InterruptedException {
        Runner_1 runner = new Runner_1();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.firstThread();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.secondThread();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        runner.finished();

    }
}

class Runner_1 {
    private Account account1 = new Account();
    private Account account2 = new Account();

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    /*
    Если в программе нельзя обойтись без того, чтобы забирать локи в
    разных порядках, то используется метод tryLock()

    В наш метод takeLocks() подаются те локи в таком порядке, в
    котором мы хотим их забрать
     */
    private void takeLocks(Lock lock1, Lock lock2) {
        boolean firstLockTaken = false;
        boolean secondLockTaken = false;

        while (true) {
            try {
                /*
                Метод tryLock() пытается забрать лок. Если это было успешно
                (то есть другой поток не удерживает этот лок), то он
                возвращает true, а если нет (например, если другой поток
                удерживает этот лок), то вернет false
                 */
                firstLockTaken = lock1.tryLock();
                secondLockTaken = lock2.tryLock();
            } finally {
                if (firstLockTaken && secondLockTaken) {
                    return;
                }

                if (firstLockTaken) {
                    lock1.unlock();
                }
                if (secondLockTaken) {
                    lock2.unlock();
                }
            }

            /*
            После каждой неудачной попытки забрать оба лока мы спим одну
            мс, чтобы дать какое-то время другим потокам забрать эти локи
             */
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void firstThread() {
        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            takeLocks(lock1, lock2);

            try {
                Account.transfer(account1, account2, random.nextInt(100));
                /*
                Метод unlock() всегда должен вызваться в finally блоке, который
                выполнит его даже при возникновении ошибки
                 */
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void secondThread() {
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            takeLocks(lock2, lock1);

            try {
                Account.transfer(account2, account1, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void finished() {
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println("Total balance = " +
                (account1.getBalance() + account2.getBalance()));
    }
}

class Account {
    private int balance = 10000;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public static void transfer(Account acc1, Account acc2, int amount) {
        acc1.withdraw(amount);
        acc2.deposit(amount);
    }
}
