package com.javatrainer.module3.exercises.set2;

public class NumarPozitiv {
    private static boolean numarPozitiv(final int numar)
    {
        return (numar>0);
    }

    public static void main(String[] args) {
        if (numarPozitiv(-10))
        {
            System.out.println("Numarul este pozitiv");
        }else
        {
            System.out.println("Numarul este negativ");
        }
    }
}
