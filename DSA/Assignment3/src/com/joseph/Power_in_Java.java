package com.joseph;

import java.util.Scanner;

public class Power_in_Java {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Enter to power number to calculate");
        int power=sc.nextInt();
        System.out.println("power of the number = "+ Math.pow(num,power));
    }
}
