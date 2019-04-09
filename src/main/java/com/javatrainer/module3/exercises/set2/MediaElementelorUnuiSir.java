package com.javatrainer.module3.exercises.set2;

public class MediaElementelorUnuiSir {
    private static double suma (int sirNumere[])
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
        double media;
        media= suma(sirNumere)/sirNumere.length;
        System.out.println("Media elementelor dintr-un sir este: "+media);
    }

}
