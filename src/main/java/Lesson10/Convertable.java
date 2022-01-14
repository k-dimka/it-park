package Lesson10;

public interface Convertable {

    default void convertCtoK(double value){
        value = ((value + 273.15)*100+0.5)/100;  //округляю до сотых в большую сторону
        value = (Double)Math.floor(value*100)/100.0; //вывожу два символа после запятой
        System.out.println(value+"K");
    }

    default void convertCtoF(double value){
        value = ((value * 1.8 + 32)*100+0.5)/100;
        value = (Double)Math.floor(value*100)/100.0;
        System.out.println(value+"F");
    }

    default void convertKtoC(double value){
        value = ((value - 273.15)*100+0.5)/100;
        value = (Double)Math.floor(value*100)/100.0;
        System.out.println(value+"C");
    }

    default void convertFtoC(double value){
        value = (((value - 32) / 1.8)*100+0.5)/100;
        value = (Double)Math.floor(value*100)/100.0;
        System.out.println(value+"C");
    }

    default void convertFtoK(double value){
        value = (((value + 459.67) / 1.8)*100+0.5)/100;
        value = (Double)Math.floor(value*100)/100.0;
        System.out.println(value+"K");
    }

    default void convertKtoF(double value){
        value = ((value * 1.8 - 459.67)*100+0.5)/100;
        value = (Double)Math.floor(value*100)/100.0;
        System.out.println(value+"F");
    }

}
