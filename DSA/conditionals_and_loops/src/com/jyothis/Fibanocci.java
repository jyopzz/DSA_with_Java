package com.jyothis;

import java.util.Scanner;

public class Fibanocci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a  number to find the fibanocci : ");
        int n=sc.nextInt();
        if (n==0){
            System.out.println(a);
        } else if (n==1) {
            System.out.println(b);
        }
        else {
            for (int i=1;i<n;i++){
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println(c);
        }

    }
}
