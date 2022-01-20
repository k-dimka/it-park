package Lesson13;

import java.util.*;

public class program {

        private static int age;

    public static void main(String[] args) {
        while (true) {
            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee(1, "Иванов Иван Иванович", "21.01.2014"));
            employees.add(new Employee(2, "Абрамова Иванка Серофимовна", "12.05.1996"));
            employees.add(new Employee(3, "Василенко Петр Афанасьевич", "22.04.2018"));
            employees.add(new Employee(4, "Ненада Мария Абдулбековна", "18.11.2021"));
            employees.add(new Employee(5, "Фелипова Ирада Васильевна", "08.05.1994"));
            employees.add(new Employee(6, "Баракуда Игорь Владимирович", "30.10.2008"));
            employees.add(new Employee(7, "Анохин Александр Ибрагимович", "17.06.2018"));
            employees.add(new Employee(8, "Матвеева Анна Ивановна", "04.08.2010"));
            employees.add(new Employee(9, "Сергиенко Василий Сергеевич", "26.10.1998"));
            employees.add(new Employee(10, "Сидоренко Иван Иванович", "14.03.2015"));

            System.out.print("Ввести желаемы стаж работы сотрудника для поиска: ");
            Scanner console = new Scanner(System.in);
            int age = console.nextInt();
            workAge workingAge = new workAge();
            List<Employee> newEmploees = new ArrayList<>();
            for (Employee list : employees) {                   //сотрудников с нужным стажем добавляем в новую коллекцию
                workingAge.experience(list.getStartWork(), age);
                if (workingAge.experience == true) {
                    newEmploees.add(list);
                }
            }

            System.out.println("Выполнен поиск сотрудников со стажем больше и равно " + age + " лет.");
            Iterator<Employee> employeeIterator = newEmploees.iterator();
            while (employeeIterator.hasNext()) {
                System.out.println(employeeIterator.next());
            }
        }
    }

}
