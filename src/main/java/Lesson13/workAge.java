package Lesson13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class workAge {

    /*private String startDate;
    private int Age;

    public workAge(String startDate, int age) {
        this.startDate = startDate;
        Age = age;
    }*/

    public workAge() {
    }

    static boolean calcYear(String startDate, int Age) {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate startWork = LocalDate.parse(startDate, format);
        LocalDate now = LocalDate.now();
        startWork.getYear();
        //now = LocalDate.now();
        int nowDate = now.getYear();
        int stDate = startWork.getYear();
        if ((nowDate - Age) > stDate) {
            return false;
       /* } else if ((nowDate - Age) <= stDate) {
            return true;
        }*/


        }

        return false;
    }