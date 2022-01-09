package Lesson9;

public class Truck extends Automobile {

    public static final int MaxDistance = 1200;

    public Truck(String model, String type) {
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
