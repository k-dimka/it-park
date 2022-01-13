package Lesson10;

import java.util.Scanner;

public interface Inputable {

    static double inputValue(Double value){
        Scanner console = new Scanner(System.in);
        value = console.nextDouble();
        return value;
    }

    static String inputUnit(String unit){
        Scanner console = new Scanner(System.in);
        unit = console.nextLine();
        return unit;
    }
}
