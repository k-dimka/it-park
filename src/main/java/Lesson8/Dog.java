package Lesson8;

public class Dog extends Animals {
    public static final String dog = "Собака";
    public Dog() {
        super(dog);
    }
    public void voice() {
        System.out.println(this.name + " лает");
    }
}
