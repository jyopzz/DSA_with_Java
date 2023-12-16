package com.jyothis;

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r = 0,count=0;
        int num=sc.nextInt(); //101
        int n= sc.nextInt();
        while (num>0){
            r=num%10;
            num=num/10;
            if (r==n){
                count+=1;
            }

        }


        System.out.println(count);
    }
}
