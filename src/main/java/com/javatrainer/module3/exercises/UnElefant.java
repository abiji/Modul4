package com.javatrainer.module3.exercises;

public class UnElefant {

   // private int strofa;

    private enum Strofa {Un, Doi,Trei,Patru,Cinci,Sase,Sapte,Opt,Noua,Zece} ;
    private Strofa strofa;

    public UnElefant() {
    }

    public UnElefant(Strofa strofa) {
        this.strofa = strofa ;
    }

    public void printVers1(final Strofa strofa) {
        if (strofa==Strofa.Un) {
            System.out.println("Un elefant se legana");
        } else {
            System.out.println(strofa + " elefanti se leganau");
        }

    }

    public void printVers2() {
        System.out.println("pe o panza de paianjen,");
    }

    public void printVers3(final Strofa strofa) {
        if (strofa==Strofa.Zece) {
            System.out.println("si pentru ca panza s-a rupt");
        } else {
            System.out.println("si pentru ca nu se rupea,");
        }

    }

    public void printVers4(final Strofa strofa) {
        switch (strofa) {
            case Un: {
                System.out.println("a mai chemat un elefant");
                break;
            }
            case Zece: {
                System.out.println("toti elefantii au cazut");
                break;
            }

            default: {
                System.out.println("au mai chemat un elefant");
            }
        }
    }

    public static void main(String[] args) {
        UnElefant elefant = new UnElefant();

        for (int i = 0; i <= 9; i++) {
            elefant.printVers1(Strofa.values()[i] );
            elefant.printVers2();
            elefant.printVers3(Strofa.values()[i]);
            elefant.printVers4(Strofa.values()[i]);
            System.out.println();
        }

    }
}
