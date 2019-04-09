package com.javatrainer.module3.exercises.set2;

public class SumaUnuiSir {
    private static int suma (int sirNumere[])
    {
        int sumaNumere=0;
        for(int numar:sirNumere)
        {
            sumaNumere+=numar;
        }
        return sumaNumere;
    }


    public static void main(String[] args) {
        int sirNumere[] = new int[] {10,15,34,9,1,6};
        System.out.println("Suma numerelor dintr-un sir este: "+suma(sirNumere));
    }
}
