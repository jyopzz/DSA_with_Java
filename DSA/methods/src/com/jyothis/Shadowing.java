package com.jyothis;

public class Shadowing {
    static int x=59; //this will be shadowing at line 8
    public static void main(String[] args) {
        System.out.println(x);
        int x=89;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
