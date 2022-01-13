package Lesson10;

public class Convert implements Convertable, Inputable {
    public Convert() {
    }

    @Override
    public void convertCtoK(double value) {
        Convertable.super.convertCtoK(value);
    }

    @Override
    public void convertCtoF(double value) {
        Convertable.super.convertCtoF(value);
    }

    @Override
    public void convertKtoC(double value) {
        Convertable.super.convertKtoC(value);
    }

    @Override
    public void convertFtoC(double value) {
        Convertable.super.convertFtoC(value);
    }

    @Override
    public void convertFtoK(double value) {
        Convertable.super.convertFtoK(value);
    }

    @Override
    public void convertKtoF(double value) {
        Convertable.super.convertKtoF(value);
    }
}
