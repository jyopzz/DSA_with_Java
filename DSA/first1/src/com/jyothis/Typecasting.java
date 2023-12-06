package com.jyothis;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
//        Scanner input =new Scanner(System.in);
//        int num=(int)(656.475);  //Type casting -- ignoring decimal value to take the integer value
//        System.out.println(num);
//
//        //automatic type casting
//        int a=257;
//        byte b=(byte)(a);
//        System.out.println(b);
//
//        byte x=20;
//        byte c=52;
//        byte v=89;
//        int m=x*c/v;
//        System.out.println(m);
//        //Atomatic type conversion
//
//        int z ='a';
//        System.out.println(z);

        int i=256;
        char c='c';
        byte b=45;
        short s=1024;
        float f =4.56f;
        double d=47.232;
        double z=(i*c)+(b/f)-(d*s);
        System.out.println((i*c)+" "+ (b/f)+" "+(d*s));
        System.out.println(z);

    }
}
