package com.jyothis;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        greet();
    }
    static void greet(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name : ");
        String name=sc.next();
        System.out.println("Welcome "+name);
    }
}
