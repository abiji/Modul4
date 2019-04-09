package com.javatrainer.module3.exercises.set3;

public class NumarCaracterString {
    private static int lungimeSirCaractere(String sirCaractere)
    {
        return sirCaractere.length();
    }

    public static void main(String[] args) {
        String sirCaracter="Ana are mere";
        System.out.println("Numarul de caractere ale sirului de caracter:"+ lungimeSirCaractere(sirCaracter));
    }
}
