package com.javatrainer.module3.exercises;

import java.util.ArrayList;

public class MailCenter {
    private int n;

    public MailCenter() {

    }


    public MailCenter(int n) {
        this.n = n;
    }

    public int[] wheight(int pack, int internWheight[]) {

        switch (pack % 10) {
            case 8:
                internWheight[0]++;
                break;
            case 4:
                internWheight[1]++;
                break;
            case 2:
                internWheight[2]++;
                break;
            default:
                throw new AssertionError("The wheight is :" + pack % 10, null);
        }
        return internWheight;
    }

    public int[] code(int pack, int[] packCode) {
        switch (pack % 100) {
            case 1:
                packCode[0]++;
                break;
            case 3:
                packCode[0]++;
                break;
            case 5:
                packCode[0]++;
                break;
            default:
                throw new AssertionError("The code is :" + pack % 100, null);
        }
        return packCode;
    }


    public static void main(String[] args) {
        MailCenter mail = new MailCenter(12);
        int packages[] = new int[]{734, 985, 785, 734, 734, 785, 738, 983, 781, 781, 923, 785};
        int internalWheight[] = new int[3];
        int externalWheight[] = new int[3];
        for (int pkg : packages) {
            if (pkg % 1000 == 7) {

                internalWheight = mail.wheight(pkg, internalWheight);
            } else if (pkg % 1000 == 9) {
                externalWheight = mail.wheight(pkg, externalWheight);

            }
        }
    }
}
