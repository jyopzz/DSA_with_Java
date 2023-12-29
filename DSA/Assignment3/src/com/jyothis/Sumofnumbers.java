package com.jyothis;

import java.util.Scanner;

public class Sumofnumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = 1,sum=0;
        while(n!=0){
            System.out.println("Enter a number");
            n =sc.nextInt();
            sum+=n;
            
        }
        System.out.println("Sum of numbers = "+sum);
    }
}
