package com.javatrainer.module3.exercises.set1;

public class Petrimetru {
   // private int latura;
//
//    public Petrimetru()
//    {
//
//    }
//
//    public Petrimetru(final int latura)
//    {
//        this.latura=latura;
//    }
//
    public static int perimetru (final int latura)
    {
        return latura *4;
    }

    public static void main(String[] args) {
        System.out.println("Petrimetru:"+ perimetru(10));

    }
}
