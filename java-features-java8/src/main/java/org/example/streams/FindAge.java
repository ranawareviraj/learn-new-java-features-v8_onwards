package org.example.streams;

import java.time.LocalDate;
import java.time.Period;

public class FindAge {
    public static void main(String[] args) {
        //  Program to Find the Age of a Person if the Birthday Date has Given
        LocalDate birthday = LocalDate.of(1990, 10, 10);
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthday, today);
        System.out.println("Age: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());
    }
}
