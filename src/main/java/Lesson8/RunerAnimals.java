package Lesson8;

public class RunerAnimals {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Koza koza = new Koza();

        Animals[] animals = new Animals[]{cat, dog, koza};
        for (Animals animal : animals) {
            animal.voice();
        }
    }
}
