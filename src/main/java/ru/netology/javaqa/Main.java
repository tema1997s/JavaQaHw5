package ru.netology.javaqa;

import ru.netology.javaqa.services.MonthCalculateService;

public class Main {
    public static void main(String[] args) {
        MonthCalculateService service = new MonthCalculateService();

        System.out.println(service.calculate(10000, 3000, 20000) + " месяца(ев) можно отдыхать.");
        System.out.println();

        System.out.println(service.calculate(100000, 60000, 150000) + " месяца(ев) можно отдыхать.");


    }
}