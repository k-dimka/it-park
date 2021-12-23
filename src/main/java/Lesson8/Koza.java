package Lesson8;

public class Koza extends Animals {
    public static final String koza = "Коза";
    public Koza() {
        super(koza);
    }
    public void voice() {
        System.out.println(this.name + " мекает");
    }
}
