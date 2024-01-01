package com.joseph;

import java.util.Scanner;

public class Electricitybill {
    public static void main(String[] args) {
        System.out.println("Electricity bill generation");
        System.out.println("Enter the prevoius reading");
        Scanner sc=new Scanner(System.in);
        int pr=sc.nextInt();
        System.out.println("Enter the new reading");
        int nr=sc.nextInt();
        System.out.println("Enter price per unit");
        int price=sc.nextInt();
        int reading=nr-pr;
        int totalprice=reading*price;
        System.out.println("Total amount to pay is "+totalprice);
    }
}
