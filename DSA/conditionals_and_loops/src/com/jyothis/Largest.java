package com.jyothis;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        //Q : Largest of 3 numbers

            int max=a;
            if (b>max){
                max=b;
            }
            if (c>max){
                max=c;
            }
        System.out.println(max);
        int ma=Math.max(c,Math.max(a,b));
        System.out.println(ma);

    }
}
