package Lesson12;

public class MyArraySizeException extends RuntimeException {
    MyArraySizeException(String msg) {
        super("Ошибка размера массива." + " " + msg);
    }

}
