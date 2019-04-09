package com.javatrainer.module3.exercises;

public class Fibonacci {
    //Print the first n Fibonacci number  F0=0, F1=1, Fn=F(n-2) + F(n-1)
    //Ex. F14 = 0 1 1 2 3 5 8 13 21 34 55 89 144 233
    private int n;


    public Fibonacci() {

    }

    public Fibonacci(int n) {
        this.n = n;

    }

    public int aduna(int val1, int val2) {
        return val1 + val2;
    }

    public void printOnScreen(int value) {
        System.out.print(value + ", ");
    }

    public static void main(String[] args) {
        Fibonacci sir = new Fibonacci(10);
        int val1 = 0;
        int val2 = 1;
        sir.printOnScreen(val1);
        sir.printOnScreen(val2);
        for (int i = 0; i < 10; i++) {
            int aux = sir.aduna(val1, val2);
            sir.printOnScreen(aux);

            val1 = val2;
            val2 = aux;


        }

    }
}
