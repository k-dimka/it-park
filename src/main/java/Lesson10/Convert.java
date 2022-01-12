package Lesson10;

public class Convert implements Convertable {
    @Override
    public void convertCtoK(double value, String unit) {
        Convertable.super.convertCtoK(value, unit);
    }

    @Override
    public void convertCtoF(double value, String unit) {
        Convertable.super.convertCtoF(value, unit);
    }

    @Override
    public void convertKtoC(double value, String unit) {
        Convertable.super.convertKtoC(value, unit);
    }

    @Override
    public void convertFtoC(double value, String unit) {
        Convertable.super.convertFtoC(value, unit);
    }

    @Override
    public void convertFtoK(double value, String unit) {
        Convertable.super.convertFtoK(value, unit);
    }

    @Override
    public void convertKtoF(double value, String unit) {
        Convertable.super.convertKtoF(value, unit);
    }
}
