package Lesson13;

import org.jetbrains.annotations.NotNull;

public class Employee implements Comparable<Employee>{

    private int serviceNumber;
    private String fio;
    private String startWork;


    public Employee(int serviceNumber, String fio, String startWork) {

        this.serviceNumber = serviceNumber;
        this.fio = fio;
        this.startWork = startWork;
    }

    public String getStartWork() {
        return startWork;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Сотрудник " +
                "табельный номер: " + serviceNumber +
                ", ФИО: '" + fio + '\'' +
                ", дата принятия на работу: '" + startWork + '\'';
    }

    @Override
    public int compareTo(@NotNull Employee o) {
        return 0;
    }
}
