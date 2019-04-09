package com.javatrainer.module3.exercises.set1;

public class NumarPar {
    public static int numarPar(final int numar) {
        return numar % 2;

    }

    public static void main(String[] args) {

        if (numarPar(9) == 0) {
            System.out.println("Numarul este par");
        } else {
            System.out.println("Numarul este impar");
        }
    }
}