package com.jyothis;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the temperature from C to F");
        float tempc=in.nextFloat();
        float tempF=(tempc *9/5)+32;
        System.out.println("temperature from degree C to F : "+tempF);
    }
}
