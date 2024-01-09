package com.joseph;

import java.util.Scanner;

public class Commission_percentage {
    public static void main(String[] args) {
        System.out.println("Commission percentage Calculator");
        System.out.println("Enter the Sales price");
        Scanner sc=new Scanner(System.in);
        int salaprice=sc.nextInt();
        System.out.println("Enter the commission rate");
        int rate=sc.nextInt();
        float commission=  (salaprice * ((float) rate /100));
        System.out.println("Commission = "+commission);
    }
}
