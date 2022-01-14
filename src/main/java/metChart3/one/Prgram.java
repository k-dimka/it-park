package metChart3.one;

public class Prgram {
    public static void main(String[] args) {

        Person tom = new Person();
        tom.displayInfo();

        tom.name = "Tom";
        tom.age = 33;
        tom.displayInfo();

        Person bob = new Person("bob");
        bob.displayInfo();

        Person hed = new Person("hed", 15);
        hed.displayInfo();

    }
}
class Person{

    String name;    // имя
    int age;        // возраст

    {
    name = "undefined";
    age = 0;
    }

    Person() {
    }

    Person(String name) {
        this.name = name;
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d%n", name, age);
    }
}
