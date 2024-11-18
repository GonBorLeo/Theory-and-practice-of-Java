package EduTinkoff;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split(" ");
        int numberEmployees_n = Integer.parseInt(firstLine[0]); // количество сотрудников
        int leavingTime_t = Integer.parseInt(firstLine[1]); // время, когда один из сотрудников покинет офис (в минутах)
        System.out.println("Старые numberEmployees_n и leavingTime_t: " + numberEmployees_n + " " + leavingTime_t);

        while (true) {
            if ((numberEmployees_n > 100 || numberEmployees_n < 2) || (leavingTime_t > 100 || leavingTime_t < 2)) {
                System.out.println("Некорректный ввод данных. Повторите ввод снова");
                firstLine = scanner.nextLine().split(" ");
                numberEmployees_n = Integer.parseInt(firstLine[0]);
                leavingTime_t = Integer.parseInt(firstLine[1]);

                System.out.println("Новые numberEmployees_n и leavingTime_t: " + numberEmployees_n + " " + leavingTime_t);
            } else {
                break;
            }
        }
        System.out.println(numberEmployees_n + " " + leavingTime_t);
    }
}
