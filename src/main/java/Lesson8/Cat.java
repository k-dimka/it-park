package Lesson8;

public class Cat extends Animals {
    public static final String cat = "Кот";
    public Cat() {
        super(cat);
    }
    public void voice() {
        System.out.println(this.name + " мяукает");
    }
}
