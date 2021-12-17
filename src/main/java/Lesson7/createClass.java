package Lesson7;

public class createClass {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.type = "cat";
        cat.nickname = "barsik";
        cat.toSwim = false;
        cat.runDistance = 200;

        Animal dog = new Animal("dog","drugok", true, 500, 10);

        Animal tiger = new Animal();
        tiger.type = "tiger";
        tiger.toSwim = true;
        tiger.toSwimDistance = 50;
        tiger.runDistance = 300;

        Animal[] animals = new Animal[] {cat, dog, tiger};
        for (Animal animal: animals) {
            if (animal.nickname == null) {
                animal.nickname = "noName";
            }
            if (animal.toSwim == true) {
                System.out.println(animal.type + " " + animal.nickname + " проплывет " + animal.toSwimDistance + "м.");
            }
            else {
                System.out.println(animal.type + " " + animal.nickname + " не умеет плавать ");
            }
        }
        for (Animal animal: animals) {
            System.out.println(animal.type + " " + animal.nickname + " пробежит " + animal.runDistance + "м.");
        }
    }
}
