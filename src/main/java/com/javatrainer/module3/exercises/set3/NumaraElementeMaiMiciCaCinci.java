package com.javatrainer.module3.exercises.set3;

public class NumaraElementeMaiMiciCaCinci {
    private static int numaraElementeSubCinci(int sirNumere[]) {
        int sumaElementeCinci = 0;
        for (int numar : sirNumere) {
            if (numar < 5) {
                sumaElementeCinci++;
            }
        }
        return sumaElementeCinci;
    }

    public static void main(String[] args) {
        int sirNumere[]=new int[] {7,4,1,6,5,0,-6};
        System.out.println("Numarul de elemente sub 5 din sir este: "+ numaraElementeSubCinci(sirNumere));
    }
}
