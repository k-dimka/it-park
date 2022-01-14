package metChart3.pakedg;

public class program {

    public static void main(String[] args) {
        Info pk = new Info("0");
        pk.dispalyInfo();
    }

}
class Info {

    String pakegName;

    public Info(String pakegName) {
        this.pakegName = "pakedg";
    }
    void dispalyInfo(){
        System.out.println(pakegName);
    }
}