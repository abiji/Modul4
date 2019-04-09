package com.javatrainer.module3.exercises.set3;

public class Substring {
    private static String subSir(String sirulDeCaractere)
    {
       return sirulDeCaractere.substring(3,7);
    }
    public static void main(String[] args) {
        String sirCaracter="Ana are mere";
        System.out.println("Substring de la index 3, 4 caractere ale sirului de caracter:"+ subSir(sirCaracter));
    }
}
