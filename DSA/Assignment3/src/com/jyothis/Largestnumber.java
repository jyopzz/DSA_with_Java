package com.jyothis;

import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = 1,largest=0;
        while(n!=0){
            System.out.println("Enter a number");
            n =sc.nextInt();
            if(largest<=n){
                largest=n;
            }


        }
        System.out.println("Largest number = "+largest);
    }
}
