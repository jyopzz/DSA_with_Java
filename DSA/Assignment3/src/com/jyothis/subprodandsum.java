package com.jyothis;

import java.util.Scanner;

public class subprodandsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 1st number");
        int num1=sc.nextInt();
        System.out.println("Enter the 2nd number");
        int num2=sc.nextInt();
        int sum=num1+num2;
        int prod=num1*num2;
        int diff=prod-sum;
        System.out.println("Subtract the Product and Sum of Digits of an Integer is : "+diff);

    }
}
