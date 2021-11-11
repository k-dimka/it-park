package Lesson3;

import java.util.Scanner;
public class l3 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("1 - Вычисление корней квадратного уравнения; 2 - Вычисление факториала числа n; 3 - Выход из программы");
            System.out.print("Введите номер нужного действия: ");
            Scanner console = new Scanner(System.in);
            int action = console.nextInt();
            {
                if (action == 3) {
                    System.out.println("До новых встреч");
                    System.exit(0);
                }
                if (action == 1) {
                    Scanner console1 = new Scanner(System.in);
                    System.out.print("Введите значение для a: ");
                    double a = console1.nextDouble();
                    if (a == 0) {
                        System.out.println("Первый коэффициент не может быть 0! У Вас есть шанс начать все сначала.");
                        /*Scanner console0 = new Scanner(System.in);
                        a = console1.nextDouble();*/
                    } else {
                        System.out.print("Введите значение для b: ");
                        double b = console1.nextDouble();
                        System.out.print("Введите значение для c: ");
                        double c = console1.nextDouble();
                        double d = b * b - 4 * a * c;
                        if (d > 0) {
                            double x1 = (-b - Math.sqrt(d)) / (2 * a);
                            double x2 = (-b + Math.sqrt(d)) / (2 * a);
                            System.out.println("Уравнение имеет два корня: " + x1 + " " + x2 + " Попробуем еще?");
                        } else if (d == 0) {
                            double x;
                            x = -b / (2 * a);
                            System.out.println("Уравнение имеет один корень: " + x + " Попробуем еще?");
                        } else {
                            System.out.println("Нет действительных решений уравнения. Попробуем еще?");
                        }
                    }
                }
                if (action == 2) {
                    System.out.print("Введите целое число n: ");
                    Scanner console2 = new Scanner(System.in);
                    int n = console2.nextInt();
                    int f = 1;
                    for (int i = 1; i <= n; i++) {
                        f = f * i;
                    }
                    System.out.print("Факториал числа "+ n + " равен: " + f + " Попробуем еще? ");
                }
            }
        }
    }
}
