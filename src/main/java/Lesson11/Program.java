package Lesson11;

public class Program {
    public static void main(String[] args) throws Exception {

        CarTrack Lada = new CarTrack(1.6, 1.8, 2, "к254па186", "Car", "Lada");
        CarTrack UAZ = new CarTrack(2.6, 2.6, 2.3, "в753он86", "Car", "UAZ");
        CarTrack BMW = new CarTrack(1.7, 2.0, 2.2, "а324рп86", "Car", "BMW");
        CarTrack MAN = new CarTrack(7.5, 4.2, 2.2, "п564яч86", "Track", "MAN");
        GetSpeedable.GetSpeed(Lada.moving(85.0), Lada.getModel(), Lada.getGosNumber());
        GetSpeedable.GetSpeed(UAZ.moving(75.0), UAZ.getModel(), UAZ.getGosNumber());
        GetSpeedable.GetSpeed(BMW.moving(175.0), BMW.getModel(), BMW.getGosNumber());
        GetSpeedable.GetSpeed(BMW.moving(60.0), MAN.getModel(), MAN.getGosNumber());
        GetMoveable.GetMoved(Lada.getWeight(), Lada.getHeight(), Lada.getWidth(), Lada.getModel(), Lada.getGosNumber());
        GetMoveable.GetMoved(UAZ.getWeight(), UAZ.getHeight(), UAZ.getWidth(), UAZ.getModel(), UAZ.getGosNumber());
        GetMoveable.GetMoved(BMW.getWeight(), BMW.getHeight(), BMW.getWidth(), BMW.getModel(), BMW.getGosNumber());
        GetMoveable.GetMoved(MAN.getWeight(), MAN.getHeight(), MAN.getWidth(), MAN.getModel(), MAN.getGosNumber());
    }

}


interface Movable {

    default double moving(double speed) {
        return speed;
    }
}

interface Modelable {

    default String Model() {
        return Model();
    }
}

interface Numberable {

    default String GosNamber() {
        return GosNamber();
    }
}
interface outerable {

    default double weight(){
        return weight();
    }
    default double height(){
        return height();
    }
    default double width(){
        return width();
    }
}
interface GetSpeedable extends Movable, Modelable, Numberable {
    static double GetSpeed(double speed, String model, String namber) {
        try {
            if (speed > 80.0 && speed < 100.0)
                throw new Exception("Превышение скорости, больше 80 км.ч., автомобиль " + model);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (speed > 100.0) throw new Exception("Превышение скорости, больше 100 км.ч. автомобиль " + model + " " +
                    "гос.номер " + namber + " остановлен полицией");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return speed;
    }
}

interface GetMoveable extends Modelable, Numberable {
    static double GetMoved(double weight, double height, double width, String model, String namber) {
        try {
            if (weight > 8.0)
                throw new Exception("Привешение веса для проезда через " +
                        "КПП, автомобиль " + model + " гос.номер " + namber);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (height > 4.0)
                throw new Exception("Привешение габаритов высоты для проезда через " +
                        "КПП, автомобиль " + model + " гос.номер " + namber);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (width > 2.5)
                throw new Exception("Привешение габаритов ширины для проезда через " +
                        "КПП, автомобиль " + model + " гос.номер " + namber);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return width;
    }
}

class Model implements Modelable {

    @Override
    public String Model() {
        return Modelable.super.Model();
    }
}

class Move implements Movable {

    @Override
    public double moving(double v) {
        return Movable.super.moving(v);
    }
}

class Namber implements Numberable {

    @Override
    public String GosNamber() {
        return Numberable.super.GosNamber();
    }
}

class GetSpeed implements GetSpeedable {

    @Override
    public double moving(double speed) {
        return GetSpeedable.super.moving(speed);
    }

    @Override
    public String Model() {
        return GetSpeedable.super.Model();
    }
}

class  outer implements outerable{

    @Override
    public double weight() {
        return outerable.super.weight();
    }

    @Override
    public double height() {
        return outerable.super.height();
    }

    @Override
    public double width() {
        return outerable.super.width();
    }
}
class GetMoved implements GetMoveable {

    @Override
    public String Model() {
        return GetMoveable.super.Model();
    }

    @Override
    public String GosNamber() {
        return GetMoveable.super.GosNamber();
    }

}


class CarTrack implements Movable {

    private String gosNumber;
    private double weight;
    private double height;
    private double width;
    private String TypeOfAuto;
    private String model;

    public CarTrack(double weight, double height, double width, String gosNumber, String typeOfAuto, String model) {
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.gosNumber = gosNumber;
        this.TypeOfAuto = typeOfAuto;
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String getGosNumber() {
        return gosNumber;
    }

    public String getTypeOfAuto() {
        return TypeOfAuto;
    }

    public String getModel() {
        return model;
    }

}
