package Lesson2;

import java.util.Scanner;
public class CalculateV2 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("1 - Сложение; 2 - Вычетание; 3 - Умножение; 4 - Деление; 5 - Выход из программы");
            System.out.println("Введите номер нужного действия");
            Scanner console = new Scanner(System.in);
            int action = console.nextInt();
            if (action == 1) {
                System.out.println("Введите первое число ");
                Scanner console1 = new Scanner(System.in);
                double a = console.nextDouble();
                System.out.println("Введите второе число");
                Scanner console2 = new Scanner(System.in);
                double b = console.nextDouble();
                double answer = a + b;
                System.out.println("Сумма чисел равна: " + answer + ". Попробуем еще?");
            } else if (action == 2) {
                System.out.println("Введите первое число");
                Scanner console1 = new Scanner(System.in);
                double a = console.nextDouble();
                System.out.println("Введите второе число");
                Scanner console2 = new Scanner(System.in);
                double b = console.nextDouble();
                double answer = a - b;
                System.out.println("Разность чисел равна: " + answer + ". Попробуем еще?");
            } else if (action == 3) {
                System.out.println("Введите первое число");
                Scanner console1 = new Scanner(System.in);
                double a = console.nextDouble();
                System.out.println("Введите второе число");
                Scanner console2 = new Scanner(System.in);
                double b = console.nextDouble();
                double answer = a * b;
                System.out.println("Произведение чисел равна: " + answer + ". Попробуем еще?");
            } else if (action == 4) {
                System.out.println("Введите первое число");
                Scanner console1 = new Scanner(System.in);
                double a = console.nextDouble();
                System.out.println("Введите второе число");
                Scanner console2 = new Scanner(System.in);
                double b = console.nextDouble();
                if (b == 0) {
                    System.out.println("На 0 делить нельзя! Повторите попытку ввода");
                    Scanner console3 = new Scanner(System.in);
                    double b1 = console.nextDouble();
                    double answer = a / b1;
                    System.out.println("Частное чисел равна: " + answer + ". Попробуем еще?");
                } else {
                    double answer = a / b;
                    System.out.println("Частное чисел равна: " + answer + ". Попробуем еще?");
                }
            } else if (action == 5) {
                System.out.println("До новых встреч");
                System.exit(0);
            } else if (action > 5) {    /* && странно, но двойное условие не работает*/
                System.out.println("Номер действия не определен");
            }  else if (action < 1) {
                System.out.println("Номер действия не определен");
            }
        }
    }
}
