package com.joseph;

import java.util.Scanner;

public class Discount_of_product {
    public static void main(String[] args) {
        System.out.println("Enter the product name");
        Scanner sc=new Scanner(System.in);
        String pname=sc.nextLine();
        System.out.println("Enter the price of the product");
        int price=sc.nextInt();
        float total= (float) ((float) price-(price*0.25));
        System.out.println("product = "+pname+"\nDiscount =25%\nTotal= " +total);
    }
}
