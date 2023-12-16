package com.jyothis;

import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r,reve=0;
        int n=sc.nextInt();
        while(n>0){
           r=n%10;
           reve=reve*10+r;
           n/=10;
        }
        System.out.println(reve);
    }
}
