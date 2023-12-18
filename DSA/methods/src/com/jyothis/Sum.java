package com.jyothis;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

    //sum();
    //System.out.println(sum2());
        System.out.println(sum3(3,8));


    }
    /*
        Access modifiers return_type name(){
        //body
        return statements
        }
        */
    static void sum(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1=sc.nextInt();
        System.out.print("Enter the num2: ");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("Sum = "+sum);
    }
//return  a value
    static int sum2(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1=sc.nextInt();
        System.out.print("Enter the num2: ");
        int num2=sc.nextInt();
        int sum=num1+num2;
        return sum;
    }
    //pass the value of  numbers when you are calling the methods in the main() -->Parameter passing
    static int sum3(int a, int b){
        int sum=a+b;
        return sum;
    }
}