package com.jyothis;

public class Overloading {   // Functions with same name and different arguments
    // In the compile time it will decide
    public static void main(String[] args) {
        over(56);
        over("Jyothis");
        System.out.println(sum(4,8));
        System.out.println(sum(12,78,99));

    }
    static void over(int a){
        System.out.println(a);
    }
    static void over(String name){
        System.out.println(name);

    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b, int c){
        return a+b+c;
    }
}
