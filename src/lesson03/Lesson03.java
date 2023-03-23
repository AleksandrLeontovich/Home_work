package lesson03;

import java.util.Random;
import java.util.Scanner;

public class Lesson03 {
    public static void main(String[] args) {
        /*
        1) Задача на FOR
        Вывести на экран первые 10 элементов последовательности 2 4 6 8 10 и тд

        2) Задача на WHILE
        Для введённого пользователем с клавиатуры целого положительного числа посчитайте сумму всех его цифр

        3) Задача на использование любого цикла (выберите сами)
        Программа загадывает число в диапазоне [1;9]
        Пользователь вводит число с клавиатуры
        Программа в зависимости от введенного числа выводит в консоль следующее:
        "загаданное число больше"
        "загаданное число меньше"
        "Вы угадали" (программа завершает работу)
        Если введен 0, выввести "выход из программы" (программа завершает работу) //

        4) Задача на использование любого цикла (выберите сами) ***
        Пользователь загадывает число в диапазоне от [2 до 100]
        Программа пытается его угадать (используйте метод бинарного поиска, т.е деление отрезка на 2).
        Программа может задавать пользователю вопросы: Число равно ...?, Число больше ...? и в зависимости от ответа пользователя принимать решения.
        Вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА
        Подумайте, что можно сделать, если пользователь загадает число вне указанного диапазона.
        Для вывода текста и значения переменной используйте оператор сложения, например System.out.println("Число равно " + number); */

        // Задача 1

        for(int a = 2, b = 10; b > 0 ; a = a+2, b--){
            System.out.print(a + " ");
        }
        System.out.println(" ");


        // Задача 2
        Scanner in = new Scanner(System.in);
        int userNumber = in.nextInt();
        int sum = 0;
        while(userNumber != 0) {
            sum += userNumber % 10; // получаем остаток от деления на 10, т.е последнюю цифру числа,
                                    // записываем ее в переменную sum
            userNumber /= 10;       // делим введенное число на 10, чтоб высчитывать предпоследнюю цифру числа,
                                    // поскольку int,то после , часть отбрасывается
        }
            System.out.println(sum);

        // Задача 3


        /* int randNumber ;
        randNumber = (int)(Math.random() * 9 + 1); */
        Random rand1 = new Random();
        int randNumber = rand1.nextInt(8) + 1; //
        System.out.println("Чтобы отгадать, какое число загадал компьютер, введите значение от 1 до 9");
        while (true) {
            Scanner in1 = new Scanner(System.in);
            int userGuess = in1.nextInt();
            if (userGuess == 0) { System.out.println("выход из программы");
            break; }
            if (userGuess > randNumber) {
                System.out.println("Загаданное число меньше");
            }
            else if (userGuess < randNumber) {
                System.out.println("Загаданное число больше");
            }
            else if (userGuess == randNumber){
                System.out.println("Вы угадали");
                break;
            }
        }


        int number = 50;
        int start = 2;
        int finish = 100;
        while (true) {
            System.out.println("Загаданное число равно " + number + " ?");
            Scanner in2 = new Scanner(System.in);
            int answer = in2.nextInt();
            if (answer == 0) {
                System.out.println("Загаданное число больше " + number + " ?");
                answer = in2.nextInt();
                if (answer == 0){
                    finish = number;
                }
                else {
                    start = number;
                }
                number = (finish +start) / 2;
                }
            else {
                System.out.println("Вы угадали");
                break;
            }
        }


    }
}
