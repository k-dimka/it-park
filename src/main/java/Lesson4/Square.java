package Lesson4;

public class Square {
        public static void main(String[] args)
        {
                System.out.print(Square(11));
        }
        public static double Square(int value) {
        double num;
        double half = (double) value / 2;
        do {
                num = half;
                half = (num + (value / num)) / 2;
        } while ((num - half) != 0);
        return half;
}
}
