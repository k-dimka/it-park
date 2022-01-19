package Lesson13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class workAge {

    public String calcYear(String startDate, int Age) {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate startWork = LocalDate.parse(startDate, format);
        LocalDate now = LocalDate.now();
        startWork.getYear();
        int nowDate = now.getYear();
        int stDate = startWork.getYear();
        if ((nowDate - Age) >= stDate) {
            System.out.println("хватает");
        } else if ((nowDate - Age) < stDate) {
            System.out.println("мало");
        }
        return startDate;
    }
}