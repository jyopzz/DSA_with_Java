package com.jyothis;

import java.util.Scanner;

public class Stringmethod {
    public static void main(String[] args) {
        System.out.println("Welcome "+greet());
    }
    static String greet(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.next();
        return name;
    }
}
