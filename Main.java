package lesson5;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Employee Employee1 = new Employee("Ivanov Ivan Ivanovich", "boss", "ivanov@gmail.com", "+1(233)466-54-89", 80000, 86);
        Employee Employee2 = new Employee("Petrov Ivan Vasilevich", "manager", "Petrov@gmail.com", "+1(345)628-49-47", 60000, 72);
        Employee Employee3 = new Employee("Pupkin Nikolay Vasilevich", "big manager", "Pupkin@gmail.com", "+1(345)446-74-82", 50000, 46);
        Employee Employee4 = new Employee("Sidorov Sergey Ivanovich", "engineer", "Sidorov@gmail.com", "+1(345)940-47-45", 50000, 35);
        Employee Employee5 = new Employee("Nikonova Inna Viktorovna", "cleaner", "Nikonova@gmail.com", "+1(345)670-59-63", 10000, 25);

        Employee1.info();
        Employee2.info();
        Employee3.info();
        Employee4.info();
        Employee5.info();

        Employee[] persArray = {
                new Employee("Ivanov Ivan Ivanovich", "boss", "ivanov@gmail.com", "+1(233)466-54-89", 30000, 74),
                new Employee("Petrov Ivan Vasilevich", "manager", "manager@gmail.com", "+1(345)628-49-47", 10000, 31),
                new Employee("Pupkin Nikolay Vasilevich", "big manager", "Pupkin@gmail.com", "+1(345)446-74-82", 50000, 46),
                new Employee("Sidorov Sergey Ivanovich", "engineer", "Sidorov@gmail.com", "+1(345)940-47-45", 50000, 43),
                new Employee("Nikonova Inna Viktorovna", "cleaner", "Nikonova@gmail.com", "+1(345)670-59-63", 10000, 25),
        };
        printArray(persArray);
    }

    static void printArray(Employee[] persArray) {
        System.out.println("Сотрудники возрастом выше 40 лет:");
        for (int i = 0; i < persArray.length; i++) {
            persArray[i].agePrint();
        }

    }
}
