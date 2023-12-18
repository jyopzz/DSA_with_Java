package com.jyothis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String fruits=sc.next();
        //Enchaned switch statements used by inteli idea
        switch (fruits) {
            case "Mango":
                System.out.println("Mango is good fruit");
                break;
            case "Apple":
                System.out.println("A for Apple");
                break;
            case "Orange":
                System.out.println("O for Orange");
                break;
            default:
                System.out.println("No fruit Found");
                break;
        }



    }
}