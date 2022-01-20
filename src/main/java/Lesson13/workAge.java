package Lesson13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class workAge {

    boolean experience;

    public workAge() {
    }

    public void experience(String startDate, int Age) {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy"); //задаю какой формат даты использую
        LocalDate startWork = LocalDate.parse(startDate, format); //получем и парсим строку в дату
        LocalDate now = LocalDate.now();
        int stDate = startWork.getYear(); //беру только год от парсинга, интую
        int nowDate = now.getYear(); //тоже с текущей даты

        if ((nowDate - Age) >= stDate) {  //проверяю стаж больше или рано подходит
            experience = true;
        } /*else if ((nowDate - Age) < stDate) { //меньше не подходит
            experience = false;
        }*/
    }
}