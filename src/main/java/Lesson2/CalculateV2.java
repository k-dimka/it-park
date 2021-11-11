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
                System.out.println("Введите первое целое число");
                Scanner console1 = new Scanner(System.in);
                int a = console.nextInt();
                System.out.println("Введите второе целое число");
                Scanner console2 = new Scanner(System.in);
                int b = console.nextInt();
                long answer = a + b;
                System.out.println("Сумма чисел равна: " + answer + ". Попробуем еще?");
            } else if (action == 2) {
                System.out.println("Введите первое целое число");
                Scanner console1 = new Scanner(System.in);
                int a = console.nextInt();
                System.out.println("Введите второе целое число");
                Scanner console2 = new Scanner(System.in);
                int b = console.nextInt();
                long answer = a - b;
                System.out.println("Разность чисел равна: " + answer + ". Попробуем еще?");
            } else if (action == 3) {
                System.out.println("Введите первое целое число");
                Scanner console1 = new Scanner(System.in);
                int a = console.nextInt();
                System.out.println("Введите второе целое число");
                Scanner console2 = new Scanner(System.in);
                int b = console.nextInt();
                long answer = a * b;
                System.out.println("Произведение чисел равна: " + answer + ". Попробуем еще?");
            } else if (action == 4) {
                System.out.println("Введите первое целое число");
                Scanner console1 = new Scanner(System.in);
                int a = console.nextInt();
                System.out.println("Введите второе целое число");
                Scanner console2 = new Scanner(System.in);
                int b = console.nextInt();
                if (b == 0) {
                    System.out.println("На 0 делить нельзя! Повторите попытку ввода");
                    Scanner console3 = new Scanner(System.in);
                    int b1 = console.nextInt();
                    long answer = a / b1;
                    System.out.println("Частное чисел равна: " + answer + ". Попробуем еще?");
                } else {
                    long answer = a / b;
                    System.out.println("Частное чисел равна: " + answer + ". Попробуем еще?");
                }
            } else if (action == 5) {
                System.out.println("До новых встреч");
                System.exit(0);
            }
        }
    }

}
