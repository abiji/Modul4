package com.javatrainer.module3.exercises.set3;

import com.javatrainer.module3.exercises.set2.MediaElementelorPare;

public class MediaElementelorImpare {
    private static class Result {
        private double suma;
        private int lungimeSir;

        public Result(double suma, int lungimeSir) {
            this.suma = suma;
            this.lungimeSir = lungimeSir;

        }
    }

        private static Result suma(int sirNumere[]) {
            int sumaNumere = 0;
            int numarNrImpare = 0;
            for (int numar : sirNumere) {
                if (numar % 2 != 0) {
                    System.out.println("Numar impar:" + numar);
                    sumaNumere += numar;
                    numarNrImpare++;
                }
            }
            return new Result(sumaNumere, numarNrImpare);
        }

        public static void main(String[] args) {

            int sirNumere[] = new int[]{10, 15, 34, 9, 1, 6};
            double media;
            Result rezultat = suma(sirNumere);
            System.out.println("Media elementelor impare este: " + rezultat.suma / rezultat.lungimeSir);
        }
    }