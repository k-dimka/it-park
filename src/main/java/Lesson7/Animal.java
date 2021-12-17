package Lesson7;

public class Animal {
    String type;
    String nickname;
    Boolean toSwim;
    int runDistance;
    int toSwimDistance;

    public Animal() {
    }

    public Animal(String type, Boolean toSwim, int runDistance, int toSwimDistance) {
        this.toSwim = toSwim;
        this.runDistance = runDistance;
        this.toSwimDistance = toSwimDistance;
        this.type = type;
    }

    public Animal(String type, String nickname, Boolean toSwim, int runDistance) {
        this.nickname = nickname;
        this.toSwim = toSwim;
        this.runDistance = runDistance;
        this.type = type;
    }

    public Animal(String type, String nickname, Boolean toSwim, int runDistance, int toSwimDistance) {
        this.nickname = nickname;
        this.toSwim = toSwim;
        this.runDistance = runDistance;
        this.toSwimDistance = toSwimDistance;
        this.type = type;
    }
}

