package com.jyothis;

public class Loops {
    public static void main(String[] args) {
        /*
        Syntax for loop
        for (initialization; condition; increment/decrement;){
        body
        }
        */

        for(int i=0;i<5;i+=1){
            System.out.println(i);
        }

        //While loop
        /*
        syntax for while loop
        while(condition){
        body
        }

        */
        int num=1;
        while(num<=5){
            System.out.println(num);
            num++;
        }

        //do while
        /*
         syntax:
         do{
         body
         }
         while (condition)
         */
        System.out.println("Do -While");
    int n=1;
        do {
            System.out.println(n);
            n++;
        }while (n<=5);

    }
}
