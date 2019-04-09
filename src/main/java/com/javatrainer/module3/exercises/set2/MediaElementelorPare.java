package com.javatrainer.module3.exercises.set2;

public class MediaElementelorPare {
    public static class Result {
        private double sumaNumere;
        private int numarNrPare;

        public Result(final double sumaNumere, final int numarNrPare) {
            this.sumaNumere = sumaNumere;
            this.numarNrPare = numarNrPare;
        }
    }


    private static Result suma(int sirNumere[]) {
        int sumaNumere = 0;
        int numarNrPare = 0;
        for (int numar : sirNumere) {
            if (numar % 2 == 0) {
                System.out.println("Numar par:" + numar);
                sumaNumere += numar;
                numarNrPare++;
            }
        }
        return new Result(sumaNumere, numarNrPare);
    }

    public static void main(String[] args) {
        int sirNumere[] = new int[]{10, 15, 34, 9, 1, 6};
        double media;
        Result rezultat = suma(sirNumere);
        media = rezultat.sumaNumere / rezultat.numarNrPare;

        System.out.println("Media elementelor pare dintr-un sir este: " + media);
    }
}
