package com.jyothis;

import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int empid=in.nextInt();
        String department=in.next();

        switch (empid){
            case 1:
                System.out.println("Jyothis Joseph");
                break;
            case 2:
                System.out.println("Jyopzz");
                break;
            case 3:
                System.out.println("Employee id 3");
                switch (department) {
                    case "IT" -> System.out.println("Department IT");
                    case "Maketing" -> System.out.println("Department Marketing");
                    default -> System.out.println("No department");
                }
                break;
            default:
                System.out.println("No input available");
        }
    }
}
