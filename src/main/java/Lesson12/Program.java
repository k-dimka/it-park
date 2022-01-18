package Lesson12;

import static java.lang.Integer.valueOf;

public class Program {

    public static void main(String[] args) {

        String[][] stringArray1 = new String[][]{
                {"S", "78", "24", "447"}, {"10", "43", "14", "75"}, {"45", "75", "5", "45"}, {"68", "678", "3", "68"}
        };
        String[][] stringArray2 = new String[][]{
                {"85", "78", "24", "447"}, {"10", "43", "14", "75"}, {"45", "75", "5", "45"}, {"68", "678", "41"}
        };
        String[][] stringArray3 = new String[][]{
                {"85", "78", "24", "447"}, {"10", "43", "14", "75"}, {"45", "75", "5", "45"}, {"68", "678", "41", "68"}
        };
        String[][] stringArray4 = new String[][]{
                {"85", "78", "24", "447"}, {"10", "43", "14", "75"}, {"45", "75", "5", "45"}
        };

        try {
            System.out.println("Сумма массива: " + Suma(stringArray4) + convert(stringArray1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма массива: " + Suma(stringArray4)+ convert(stringArray2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма массива: " + Suma(stringArray4) + convert(stringArray3));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма массива: " + Suma(stringArray4) + convert(stringArray4));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
    }

    private static int convert(String[][] in) throws MyArraySizeException {

        if (in.length != 4) {
            throw new MyArraySizeException(String.format("Массив должен быть 4х4."));
        }
        for (int i = 0; i < in.length; i++) {
            if (in[i].length != 4) {
                throw new MyArraySizeException(String.format("Массив должен быть 4х4."));
            }
        }
        return 0;
    }

    private static int Suma(String[][] in) throws MyArrayDataException {

        int suma = 0;

        for (int i = 0; i < in.length; i++) {
            for (int a = 0; a < in[i].length; a++) {
                try {
                    suma += valueOf(in[i][a]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("В позиции [" + i + "][" + a + "] массива находится символ: " + in[i][a]));
                }
            }
        }

        return suma;
    }

}
