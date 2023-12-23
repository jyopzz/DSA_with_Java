package com.jyothis;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(isprime(n));
        System.out.println("Armstrong "+armstrong(n));
    }
    static boolean isprime(int a){
        if (a<=1){
            return false;
        }
        int c=2;
        while(c*c<=a){
            if(a%c==0){
                return false;
            }
            c++;
        }
        if (c*c>a){
            return true;
        }
        else {
            return false;
        }
    }


    static boolean armstrong(int n){
        int orginal=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem*rem*rem;
            n=n/10;
        }
        if (sum==orginal){
            return true;
        }
        else
            return false;




    }
}
