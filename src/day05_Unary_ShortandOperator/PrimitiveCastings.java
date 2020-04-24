package day05_Unary_ShortandOperator;

public class PrimitiveCastings {

    public static void main(String[] args) {

        // implicit castings: done automatically

        int a = 10;
        long b = a; // implicit casting is done automatically
                // b = 10L;


        int a1 = 100;
        long b1 = (long) a1; // manually doing the implicit castings

        //Explicit Castings

        int Inum = 100;
        byte Bnum = (byte)Inum;

        short Snum = (short)Inum;

        double dnum = 5.5;

        float Fnum = (int) 5.5;

        System.out.println(Fnum);

        double D1 = 10.5;
        // long L1 = (long) ((float) D1);

        float F1 = 60.5f;
        int I1 = (int)F1;
        System.out.println(I1);

        long largeNum = 9999999999L;
        int intNum = (int)largeNum;
        System.out.println(intNum);

        char ch1 = 'a';

        short sh1 = (short)ch1;

        char ch2 = 23456;

        double dbl1 = ch2;

        System.out.println(dbl1);

        int z1 = 10;

        double t1b = z1;

    }

    }
