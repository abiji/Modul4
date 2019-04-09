package com.javatrainer.module3.exercises;

import java.time.LocalDate;

public class Februarie29 {
    // Last time in which year 29 February was Thursday

    public Februarie29() {

    }

    public boolean anBisect(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
       //  System.out.println("An bisect " + year);
            return true;
        }
        else return false;
    }

    public int dayOfWeek(int year) {
        int dayOfWeek = LocalDate.of(year, 2, 29).getDayOfWeek().getValue();
        return dayOfWeek;
    }

    public static void main(String[] args) {
        Februarie29 an = new Februarie29();

        for (int i = 2019; i >= 0; i--) {
            if (an.anBisect(i) && an.dayOfWeek(i) == 1) {
                System.out.println("Anul bisect " + i);
                break;
            }

        }
    }

}
