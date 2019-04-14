package com.kevin;

public class TwistInTaleNumberSystems {
    public static void main(String[] args) {
        int baseDecimal = 267;
        int octVal = 0413;
        int hexVal = 0x10B;
        int binVal = 0b100001011;
        System.out.println(baseDecimal + octVal);
        System.out.println(hexVal + binVal);

        char c1 = 122;

        char c2 = '\uf022';
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        boolean b1, b2, b3, b4, b5, b6;
        b1 = b2 = b3 = true;
        //b4 = 0;
        //b5 = 'false';
        //b6 = yes;

        char char1 = 'a';
        System.out.println(char1);
        System.out.println(char1 + char1);

        final byte age1 = 10;
        final byte age2 = 20;
        short sum = age1 + age2;

        int a = 20;
        int b = 10;
        ++a;
        b++;
        System.out.println(a);
        System.out.println(b);

        int c = 20;
        int d = 10;
        int e = c - ++d;
        System.out.println(e);
        System.out.println(d);

        int f = 20;
        int g = 10;
        int h = f - g++;
        System.out.println(h);
        System.out.println(g);

        int i1 = 10;
        int i2 = 20;
        System.out.println(i1 >= i2);
        long long1 = 10;
        long long2 = 20;
        System.out.println(long1 <= long2);
        System.out.println("_______________");


        int a1 = 10;
        int b8 = 20;
        System.out.println(a1 == b8);
        System.out.println(a1 != b8);
        boolean b7 = false;
        System.out.println(b7 == true);
        System.out.println(b7 != true);
        System.out.println(b7 == false);
        System.out.println(b7 != false);








    }
}
