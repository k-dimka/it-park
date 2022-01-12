package Lesson10;

public interface Convertable {

    default void convertCtoK(double value, String unit){
        unit = "K";
        value = value + 273.15;
        System.out.println(value+unit);
    }

    default void convertCtoF(double value, String unit){
        unit = "F";
        value = value * 1.8 + 32;
        System.out.println(value+unit);
    }

    default void convertKtoC(double value, String unit){
        unit = "C";
        value = value - 273.15;
        System.out.println(value+unit);
    }

    default void convertFtoC(double value, String unit){
        unit = "C";
        value = (((value - 32) / 1.8)*100+0.5)/100;
        value = (Double)Math.floor(value*100)/100.0;
        System.out.println(value+unit);
    }

    default void convertFtoK(double value, String unit){
        unit = "K";
        value = (((value + 459.67) / 1.8)*100+0.5)/100;
        value = (Double)Math.floor(value*100)/100.0;
        System.out.println(value+unit);
    }

    default void convertKtoF(double value, String unit){
        unit = "F";
        value = value * 1.8 - 459.67;
        System.out.println(value+unit);
    }
}
