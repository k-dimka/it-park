package Lesson12;

public class MyArrayDataException extends RuntimeException {
    MyArrayDataException(String msg) {
        super("Ошибка преобразование не удалось." + " " + msg);
    }


}
