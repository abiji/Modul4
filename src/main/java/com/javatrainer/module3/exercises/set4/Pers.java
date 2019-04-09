package com.javatrainer.module3.exercises.set4;

public class Pers {
    public static String persoanaMajora(Persoana p) {
        if (p.age >= 18) {
            return p.name;
        } else {
            return "Minor";
        }
    }
}
