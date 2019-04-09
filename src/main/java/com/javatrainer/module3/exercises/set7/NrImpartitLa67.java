package com.javatrainer.module3.exercises.set7;

public class NrImpartitLa67 {
    public static boolean NrImpartitla67(int nr)
    {
        return nr % 67==23;

    }

    public static void main (String args[])
    {
        for(int nr=1000; nr<=9999;nr++ )
        {
            if (NrImpartitla67(nr))
                 System.out.println("Numarul:"+nr);
        }
    }
}
