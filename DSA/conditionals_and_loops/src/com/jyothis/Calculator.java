package com.jyothis;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int res = 0;
        while(true){
            System.out.println("Enter the operator");
            char op=sc.next().trim().charAt(0);
            if (op=='+'|| op=='-'||op=='*'||op=='/'||op=='%'){
                System.out.println("Enter a numbers");

                int num1=sc.nextInt();
                int num2= sc.nextInt();
                if (op=='+'){
                    res=num1+num2;
                }
                else if (op=='-') {
                    res=num1-num2;
                }
                else if (op=='*') {
                    res=num1*num2;
                }
                else if (op=='/') {
                    res=num1/num2;
                }
                else {
                    res=num1%num2;
                }
            } else if (op=='x'||op=='X') {
                break;

            } else {
                System.out.println("Enter a valid operator");
            }
            System.out.println(res);
        }

    }
}
