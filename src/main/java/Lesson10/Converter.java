package Lesson10;

public class Converter {
    public static void main(String[] args) {
        double val = 1;       //эти данные будут вводится через scaner
        String param = "K";   //есть мысль реализовать через метод разделение первой и второй части ввода, типа 1.0С принимаем
        // и используем только букву для условий if
        Convertable converter = new Convert();
        if (param == "C") {
            System.out.print(val + param + " равен ");
            converter.convertCtoK(val, param);
            System.out.print(val + param + " равен ");
            converter.convertCtoF(val, param);
        }
        if (param == "F") {
            System.out.print(val + param + " равен ");
            converter.convertFtoC(val, param);
            System.out.print(val + param + " равен ");
            converter.convertFtoK(val, param);
        }
        if (param == "K") {
            System.out.print(val + param + " равен ");
            converter.convertKtoC(val, param);
            System.out.print(val + param + " равен ");
            converter.convertKtoF(val, param);
        }
    }
}
