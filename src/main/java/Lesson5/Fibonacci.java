package Lesson5;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Вычисление значения в последовательности Фибоначчи");
        System.out.print("Введите число N последовалтельностей:");
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        double a = 1;
        if (N>0) {
            double b = 1;
            N = N-1;
            while(N>0) {
                double c = a + b;
                N = N-1;
                a = b;
                b = c;
                System.out.print(a+" ");
            }
        }
    }
}
