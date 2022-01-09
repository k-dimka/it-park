package Lesson9;

import Lesson8.Animals;

import java.awt.*;
import java.util.Random;

public class move {

    public static void main(String[] args) {
        Car Lada = new Car("Lada", "Car");
        Truck Ford = new Truck("Ford", "Truck");
        Car KIA = new Car("KIA", "Car");
        Truck Man = new Truck("Man", "Truck");
        Car Audi = new Car("Audi", "Car");
        Truck Kamaz = new Truck("Kamaz", "Truck");
        Car Mazda = new Car("Mazda", "Car");
        Truck Mersedes = new Truck("Mersedes", "Truck");

        Automobile[] avto = new Automobile[]{Lada, Ford, KIA, Man, Audi, Kamaz, Mazda, Mersedes};
        for (Automobile car : avto) {
            car.move();
        }
    }
}
