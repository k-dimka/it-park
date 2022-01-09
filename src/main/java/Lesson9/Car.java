package Lesson9;

public class Car extends Automobile {

    public static final int MaxDistance = 500;

    public Car(String model, String type) {
        super(model, type);
    }

    public void move() {
        final int random = random(MaxDistance);
        System.out.println(this.model + " проехал " + random + " км.");
    }

    public static int random(int MaxDistance) {
        return (int) (Math.random() * ++MaxDistance);
    }
}
