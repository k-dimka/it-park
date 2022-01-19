package Lesson13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class workAge {

    public String calcYear(String startDate, int Age) {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy"); //задаю какой формат даты использую
        LocalDate startWork = LocalDate.parse(startDate, format); //получаю дату парсим строку в дату
        LocalDate now = LocalDate.now();
        int stDate = startWork.getYear(); //беру только год от парсинга, интую
        int nowDate = now.getYear(); //тоже с текущей даты

        if ((nowDate - Age) >= stDate) {
            System.out.println("хватает");
        } else if ((nowDate - Age) < stDate) {
            System.out.println("мало");
        }
        return startDate;
    }
}