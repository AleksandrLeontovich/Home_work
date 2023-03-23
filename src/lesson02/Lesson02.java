package lesson02;

import java.util.Scanner;

public class Lesson02 {
    public static void main(String[] args) {

        /* Задача на тернарный оператор

        1) Дано целое число. Если оно чётное, выведите в консоль 0, если нет, то выведите в консоль -1;

        Задача на IF
        2) Дан номер месяца, например int month = 5. В зависимости от данного значения вывести в консоль время года

        Задача на IF
        3) Дана целочисленная переменная count - количество верных ответов. В зависимости от значения этой переменной
        вывести в консоль оценку: 100 - 90 правильных ответов - отлично 89 - 60 правильных ответов - хорошо
        59 - 40 правильных ответов - удовлетворительно 39 - 0 правильных ответов - попробуйте в следующий раз

        Задача на Math.random() и IF
        4) Самостоятельно разобрать как работает Math.random() и написать код, который будет проверять попало ли
        случайно сгенерированное целое число из отрезка [10;500] в интервал (25;200) и выводить результат в консоль.

        [10;500] - квадратные скобки означают, что числа включены в диапазон. (25;200) - круглые скобки означают,
        что числа не включены в диапазон

        Примеры работы программы:

        Число 345 не содержится в интервале (25;200)
        Число 110 содержится в интервале (25;200)


        Задача на SWITCH (ДЕЛАЙТЕ, ЕСЛИ РАЗБЕРЕТЕСЬ САМОСТОЯТЕЛЬНО ПО PDF ФАЙЛУ)

        5) Дана переменная sum - сумма покупки и переменна saleCode - номер купона.

        Если номер купона равен 4525 - вывести сумму с учетом скидки 30%
        Если номер купона равен 6424 или 7012 - вывести сумму с учетом скидки 20%
        Если номер купона равен 7647 или 9011 или 6612 - вывести сумму с учетом скидки 10%
        В остальных случаях скидка не предусмотрена, вывесть полную стоимость покупки. */


        // Задача 1

        int a = 58;
        if ((a % 2) == 0){
            System.out.println("0"); }
                else System.out.println("-1");

        int b = 69;
        b = ((b % 2) == 0) ? 0 : -1;
            System.out.println(b);

        // Задача 2

        int month = 5;
        if (month == 1) { System.out.println("январь"); }
            else if (month == 2) { System.out.println("февраль"); }
                else if (month == 3) { System.out.println("март");}
                    else if (month == 4) { System.out.println("апрель");}
                        else if (month == 5) { System.out.println("май");}
                            else if (month == 6) { System.out.println("июнь"); }
                                else if (month == 7) { System.out.println("июль"); }
                                    else if (month == 8) { System.out.println("август"); }
                                        else if (month == 9) { System.out.println("сентябрь"); }
                                            else if (month == 10) { System.out.println("октябрь"); }
                                                else if (month == 11) { System.out.println("ноябрь"); }
                                                    else if (month == 12) { System.out.println("декабрь"); }


        // Задача 3

        int count = 89;
        if (count >= 90 && count <= 100) { System.out.println("отлично");};
             if (count >= 60 && count <= 89) { System.out.println("хорошо");};
                if (count >= 40 && count <= 59) { System.out.println("удовлетворительно");};
                    if (count >= 0 && count <= 39) { System.out.println("попробуйте в следующий раз");};


        // Задача 4

        int f = (int)(Math.random() * 500 + 10);
            System.out.println(f);
        if (f > 25 && f < 200){
                System.out.println("Случайно сгенерированное число " + f + " попало в указанный диапазон");
                    }
            else {
            System.out.println("Случайно сгенерированное число " + f + " не попало в указанный диапазон");
        }

        // Задача 5

        System.out.println("Введите сумму покупки");
        Scanner in = new Scanner(System.in);
        double sum = in.nextDouble();
        System.out.println("Введите номер скидочного купона");
        Scanner in1 = new Scanner(System.in);
        int saleCode = in1.nextInt();;
        switch (saleCode){
            case 4525 -> System.out.println("Сумма Вашей покупки с учетом скидки в 30% составляет: " + (int)(sum * 0.7) + " рублей");
            case 6424, 7012 -> System.out.println("Сумма Вашей покупки с учетом скижки в 20% составляет: " + (int)(sum * 0.8) + " рублей");
            case 7647, 9011, 6612 -> System.out.println("Сумма Вашей покупки с учетом скидки в 10% составляет: " + (int)(sum * 0.1) + " рублей");
            default -> System.out.println("Сумма Вашей покупки составляет " + sum + " рублей");

        }

    }


}
