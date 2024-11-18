package LambdaExpressions;

interface Executable_2 {
    int execute(int x, int y);
}

class Runner_2 {
    public void run(Executable_2 e) {
        int a = e.execute(10, 15);
        System.out.println(a);
    }
}

public class Lambda_1b {
    public static void main(String[] args) {
        Runner_2 runner2 = new Runner_2();

        runner2.run(new Executable_2() {
            @Override
            public int execute(int x, int y) {
                System.out.println("Hello");
                return x + y;
            }
        });

        /*
        переменная, которая предается в лямбда-выражение извне,
        должна быть или константой, или неявной константой (не
        меняться в течение выполнения программы).

         */
        int a = 1;
        runner2.run((x, y) -> x + y + a);
    }
}
