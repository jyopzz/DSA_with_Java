package com.jyothis;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char ch=sc.next().trim().charAt(0);
        if (ch>='a' && ch <='z'){
            System.out.println("Smaller");
        } else if (ch>='A' && ch<='Z') {
            System.out.println("Capital");
            
        }
        else {
            System.out.println("Not defined");
        }
        System.out.println(ch);
    }
}
