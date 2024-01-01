package com.joseph;

import java.util.Scanner;

public class AverageNnumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int i=0;
        int sum=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        float avg=(float) sum/n;
        System.out.println("Average of number is "+avg);
    }
}
