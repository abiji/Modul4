package com.javatrainer.module3.exercises;


import java.time.LocalDate;

public class Thursday {
//    How many Thursdays where in the last 50 years which where at day 11 of the month

    public Thursday() {

    }

    public int dayOfWeek(int year, int month) {
        int dayOfWeek = LocalDate.of(year, month, 11).getDayOfWeek().getValue();
       // System.out.println("Day of week for "+ year +"/"+month+"/11 is:"+dayOfWeek);
        return dayOfWeek;
    }


    public static void main(String[] args) {
        Thursday day = new Thursday();
        int count = 0;
        int yearCount = 1;
        int year=2019;
        while (yearCount <= 50) {
            for(int month=1; month<=12; month++) {
                if (day.dayOfWeek(year, month) == 4) {
                    count++;
                }
            }
            year--;
            yearCount++;
        }
        System.out.println("Thursdays in the last 50 year: "+count);
    }
}
