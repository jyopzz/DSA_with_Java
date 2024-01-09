package com.joseph;

import java.util.Scanner;

public class Distance_btw_two_points {
    public static void main(String[] args) {
        System.out.println("Enter first distance");
        Scanner sc=new Scanner(System.in);
        float firstd=sc.nextFloat();
        System.out.println("Enter second distance");
        float secondd=sc.nextFloat();
        float distance=secondd-firstd;
        System.out.println("Distance between two distance is ="+distance);
    }
}
