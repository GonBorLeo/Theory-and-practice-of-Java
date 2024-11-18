package EduTinkoff;

/*

У Кати насыщенный день на работе. Ей надо передать n разных договоров коллегам.
Все встре- чи происходят на разных этажах, а между этажами можно перемещаться только по лестничным пролетам —
считается, что это улучшает физическую форму сотрудников. Прохождение каждого пролета занимает ровно 1 минуту.

Сейчас Катя на парковочном этаже, планирует свой маршрут. Коллег можно посетить в любом порядке, но один из них покинет офис через
t минут. С парковочного этажа лестницы нет — только лифт, на котором можно подняться на любой этаж.

В итоге план Кати следующий:

Подняться на лифте на произвольный этаж. Считается, что лифт поднимается на любой этаж за 0 минут.
Передать всем коллегам договоры, перемещаясь между этажами по лестнице. Считается, что договоры на этаже передаются мгновенно.
В первые t минут передать договор тому коллеге, который планирует уйти.
Пройти минимальное количество лестничных пролетов.
Помогите Кате выполнить все пункты ее плана.

Формат входных данных
В первой строке вводятся целые положительные числа n и t (2 <= n, t <= 100) — количество сотрудников и время,
когда один из сотрудников покинет офис (в минутах). В следующей строке n чисел — номера этажей, на которых находятся сотрудники.
Все числа различны и по абсолютной величине не превосходят 100.
Номера этажей даны в порядке возрастания. В следующей строке записан номер сотрудника, который уйдет через t минут.

Формат выходных данных
Выведите одно число — минимально возможное число лестничных пролетов, которое понадобится пройти Кате.

Замечание
В первом примере времени достаточно, чтобы Катя поднялась по этажам по порядку:

Ввод
5  5
1  4  9  16  25
2

Вывод
24

Во втором примере Кате понадобится подняться к уходящему сотруднику, а потом пройти всех остальных — например, в порядке {1,2,3,4,6}:

Ввод
6  4
1  2  3  6  8  25
5

Вывод
31

 */

import java.util.*;

public class test_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split(" ");
        int numberEmployees_n = Integer.parseInt(firstLine[0]); // количество сотрудников
        int leavingTime_t = Integer.parseInt(firstLine[1]); // время, когда один из сотрудников покинет офис (в минутах)
        while (true) {
            if ((numberEmployees_n > 100 || numberEmployees_n < 2) || (leavingTime_t > 100 || leavingTime_t < 2)) {
                System.out.println("Некорректный ввод данных. Повторите ввод снова");
                firstLine = scanner.nextLine().split(" ");
                numberEmployees_n = Integer.parseInt(firstLine[0]);
                leavingTime_t = Integer.parseInt(firstLine[1]);

            } else {
                break;
            }
        }

        String[] secondLine = scanner.nextLine().split(" "); // преобразование строки с номерами этажей в массив
        Integer[] floorNumbers = new Integer[numberEmployees_n]; //  создание пустого целочистенного массива

        while (true) {
            int x = 0;
            int multiplicationFloors = 1;
            if (secondLine.length != numberEmployees_n) {                   // Проверка, что количество сотружников совпадает с количеством их же этажей
                System.out.println("Некорректный ввод данных. Повторите ввод снова - 1");
                secondLine = scanner.nextLine().split(" ");
            } else {
                for (String s : secondLine) {
                    multiplicationFloors = multiplicationFloors * Integer.parseInt(s);
                }

                if (multiplicationFloors < 1) {                             // Проверка, что не введены этажи ноль и меньше
                    System.out.println("Некорректный ввод данных. Повторите ввод снова - 2");
                    secondLine = scanner.nextLine().split(" ");
                } else {

                    for (String s : secondLine) {               // перенос в новый массив и преобразование номеров этажей в числа
                        floorNumbers[x] = Integer.parseInt(s);
                        x++;
                    }
                    Arrays.sort(floorNumbers);                                  // сортировка, если номера этажей были введены вразнобой

                    if (floorNumbers[floorNumbers.length - 1] > 100) {          // Проверка, что все числа по абсолютной величине не превосходят 100
                        System.out.println("Некорректный ввод данных. Повторите ввод снова - 3");
                        secondLine = scanner.nextLine().split(" ");
                    } else {
                        boolean duplicates = false;
                        for (int i = 1; i < floorNumbers.length - 1; i++) {
                            if (floorNumbers[i].equals(floorNumbers[i + 1])) {
                                duplicates = true;
                                break;
                            }
                        }
                        if (duplicates) {                                       // Проверка, что все числа различны и нет дубликатов
                            System.out.println("Некорректный ввод данных. Повторите ввод снова - 4");
                            secondLine = scanner.nextLine().split(" ");
                        } else {
                            break;
                        }
                    }
                }
            }
        }

        int LeavingEmployeeFloorSerialNumber = scanner.nextInt();               // Порядковый номер этажа сотрудника, который уйдет через t минут
        while (true) {
            if (LeavingEmployeeFloorSerialNumber > floorNumbers.length || LeavingEmployeeFloorSerialNumber < 1) {
                System.out.println("Некорректный ввод данных. Повторите ввод снова");
                LeavingEmployeeFloorSerialNumber = scanner.nextInt();
            } else {
                break;
            }
        }

        scanner.close();
/*

Ввод 5  5     1  4  9  16  25       2          Вывод 24

Ввод 6  4     1  2  3  6  8  25        5           Вывод 31

*/

        int lastFloor = floorNumbers[floorNumbers.length - 1];                    // последний по счету этаж
        int firstFloor = floorNumbers[0];                                         // первый по счету этаж
        int numberOfSteps = lastFloor - firstFloor;                               // общее число лестничных пролетов

        List<Integer> listFloorNumbers = new ArrayList<>();
        Collections.addAll(listFloorNumbers, floorNumbers);


        int floorNumberDepartingEmployee = listFloorNumbers.get(LeavingEmployeeFloorSerialNumber - 1); // Номер этажа сотрудника, который уходит через t минут

        if ((leavingTime_t > floorNumberDepartingEmployee - firstFloor)
                ||
                (leavingTime_t > lastFloor - floorNumberDepartingEmployee)) {
            System.out.println(numberOfSteps);
        } else {
            if (floorNumberDepartingEmployee - firstFloor < lastFloor - floorNumberDepartingEmployee) { // условие проверки, что выгоднее сначала пойти на первый этаж, а уже затем подниматься
                System.out.println(floorNumberDepartingEmployee - 1 + numberOfSteps);
            } else { // иначе если выгоднее сначала пойти на самый высокий этаж, а уже затем спускаться
                System.out.println(lastFloor - floorNumberDepartingEmployee + numberOfSteps);
            }
        }
    }
}