package Lesson9;

public abstract class Automobile {

    final String model;
    private Integer distance;
    private String type;
    public abstract void move();


    public Automobile(String model, String type) {
        this.model = model;
        this.type = type;
        this.distance = 0;
    }


}


