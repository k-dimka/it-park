package Lesson10;

public class Converter {
    public static void main(String[] args) {

        while (true) {
            Convertable converter = new Convert();
            System.out.print("ввести значение температуры: ");
            double val = Convertable.inputValue(0.0);
            System.out.print("из какой еденицы переводить? С - цельсий, F - Фаренгейт, K - Кельфин: ");
            String param = Convertable.inputUnit("");

            if (param.equals("C")) {
                System.out.print(val + param + " равен ");
                converter.convertCtoK(val, param);
                System.out.print(val + param + " равен ");
                converter.convertCtoF(val, param);
            }
            if (param.equals("F")) {
                System.out.print(val + param + " равен ");
                converter.convertFtoC(val, param);
                System.out.print(val + param + " равен ");
                converter.convertFtoK(val, param);
            }
            if (param.equals("K")) {
                System.out.print(val + param + " равен ");
                converter.convertKtoC(val, param);
                System.out.print(val + param + " равен ");
                converter.convertKtoF(val, param);
            }
        }
    }
}
