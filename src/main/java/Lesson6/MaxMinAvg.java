package Lesson6;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.lang.Math;

public class MaxMinAvg {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Выберите действие: 1 - Условие: MinMaxAvg, 2 - Условие: Числа Фибоначи в массив, 0 - выход: ");
            Scanner console = new Scanner(System.in);
            int required = console.nextInt();
            if (required == 1) {
                Avg();
            } else if (required == 2) {
                Fib();
            } else if (required == 0) {
                System.out.println("До новых встреч");
                System.exit(0);
            }
        }
    }

    public static void Avg() {
        while (true) {
            System.out.print("Введите длинну массива: ");
            Scanner console = new Scanner(System.in);
            int len = console.nextInt();
            Double[] Array = new Double[len];
            double a = 0;
            for (int i = 0; i < len; i++) {
                Array[i] = Math.random();
                System.out.println(Array[i]);
            }
            System.out.print("Выберите действие: 1 - рассчитывающих минимальное, 2 - максимальное, 3 - среднее значение в массиве, 9 - выход из метода, 0 - выход из программы: ");
            int number = console.nextInt();
            if (number == 1) {
                Double min = getMin(Array);
                System.out.println("Минимальное значение: " + min);
            } else if (number == 2) {
                Double max = getMax(Array);
                System.out.println("Максимальное значение: " + max);
            } else if (number == 3) {
                Double avg = getAvg(Array);
                System.out.println("Среднее значение: " + avg);
            } else if (number == 9) {
                return;
            } else if (number == 0) {
                System.exit(0);
            }
        }
    }

    public static double getMin(Double[] Array) {
        double minValue = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] < minValue) {
                minValue = Array[i];
            }
        }
        return minValue;
    }

    public static double getMax(Double[] Array) {
        double maxValue = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] > maxValue) {
                maxValue = Array[i];
            }
        }
        return maxValue;
    }

    public static Double getAvg(Double[] Array) {
        double avgValue = 0;
        for (double i : Array) {
            avgValue += i;
        }
        return avgValue / Array.length;
    }

    public static void Fib() {
        Scanner console = new Scanner(System.in);
        Double[] Array = new Double[0];
        while (true) {
            System.out.print("Выберите действие: 1 - Числа Фибоначи в массив, 9 - выход из метода, 0 - выход из программы: ");
            int number = console.nextInt();
            if (number == 1) {
                while (true) {
                    System.out.print("Введите число N последовалтельностей Фибоначчи: ");
                    int N = console.nextInt();
                    if (Array.length != N) {
                        System.out.println("Новый запрос, расчет последовательности с записью в массив:");
                        Array = new Double[N];
                        double a = 1;
                        int in = -1;
                        if (N > 0) {
                            double b = 1;
                            N = N - 1;
                            while (N > 0) {
                                double c = a + b;
                                N = N - 1;
                                a = b;
                                b = c;
                                in = in + 1;
                                Array[in] = a;
                                System.out.println(Array[in]);
                            }
                        }
                    }
                    if (Array.length == N) {
                        System.out.println("Повторный запрос, вывод ранее вычесленного из массива:");
                        for (int i = 0; i < (N - 1); i++) {
                            System.out.println(Array[i]);
                        }
                    }
                }
            } else if (number == 9) {
                return;
            } else if (number == 0) {
                System.exit(0);
            }
        }
    }
}

