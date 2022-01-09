package Lesson9;

import Lesson8.Animals;

import java.awt.*;
import java.util.Random;

public class move {

    public static void main(String[] args) {
        Automobile Lada = new Car("Lada", "Car");
        Automobile Ford = new Truck("Ford", "Truck");
        Automobile KIA = new Car("KIA", "Car");
        Automobile Man = new Truck("Man", "Truck");
        Automobile Audi = new Car("Audi", "Car");
        Automobile Kamaz = new Truck("Kamaz", "Truck");
        Automobile Mazda = new Car("Mazda", "Car");
        Automobile Mersedes = new Truck("Mersedes", "Truck");

        Automobile[] avto = new Automobile[]{Lada, Ford, KIA, Man, Audi, Kamaz, Mazda, Mersedes};
        for (Automobile car : avto) {
            car.move();
        }
    }
}
