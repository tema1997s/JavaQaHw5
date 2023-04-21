package ru.netology.javaqa.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MonthCalculateServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/month.csv")

    public void testMonthCalculate(int expected, int income, int expenses, int threshold) {
        MonthCalculateService service = new MonthCalculateService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }


}
