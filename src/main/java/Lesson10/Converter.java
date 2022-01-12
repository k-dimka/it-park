package Lesson10;

public class Converter {
    public static void main(String[] args) {
        double val = 1;
        String param = "K";
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
