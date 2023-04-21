package ru.netology.javaqa.services;

public class MonthCalculateService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = (money - expenses) / 3;
                System.out.println("Месяц " + (month + 1) + ". Денег " + money + ". Буду отдыхать. Потратил -" + expenses + ", а затем ещё -" + (money - expenses) / 3);
            } else {
                System.out.println("Месяц " + (month + 1) + ". Денег " + money + ". Придётся работать. Заработал +" + income + ", потратил -" + expenses);
                money = money + income - expenses;
            }
        }
        return count;
    }
}
