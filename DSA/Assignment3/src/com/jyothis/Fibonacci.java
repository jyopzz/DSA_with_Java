package com.jyothis;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        int c=0;
        System.out.println("Enter a number ");
        int num=sc.nextInt();
        if(num<=0){
            System.out.println(a);
        }
        else {
            for (int i=1;i<=num;i++){
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println(c);

        }
    }
}
