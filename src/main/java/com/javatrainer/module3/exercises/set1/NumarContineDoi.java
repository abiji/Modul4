package com.javatrainer.module3.exercises.set1;

public class NumarContineDoi {
    // Integer.toString(129).contains("2");
    public static boolean cifraDoi(int numar) {
        while (numar > 0) {
            if (numar % 10 == 2) {
                return true;
            } else {
                numar = numar / 10;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        if (cifraDoi(129)) {

            System.out.println("Numarul contine cifra doi");
        } else {
            System.out.println("Numarul nu contine cifra 2");
        }
    }
}