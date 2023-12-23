package com.jyothis;

import java.util.Scanner;

public class  Stringmethod {
    public static void main(String[] args) {
        System.out.println("Welcome "+greet());
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String message=greeting(name);
        System.out.println(message);
    }

    static String greeting(String name) {
        String mssg="Hello" +name;
        return mssg;
    }

    static String greet(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.next();
        return name;
    }
}
