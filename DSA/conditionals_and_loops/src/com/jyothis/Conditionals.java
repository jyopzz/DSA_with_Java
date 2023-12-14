package com.jyothis;

public class Conditionals {
    public static void main(String[] args) {
        int salary= 25000;
//        if ( salary > 10000){
//            salary+=1000;
//        }
//        else {
//            salary+=500;
//        }
//        System.out.println(salary);

        //multiple else statements
        if (salary>10000){
            salary+=2000;
        } else if (salary>20000) {
            salary+=3000;
        }
        else {
            salary+=1000;
        }
        System.out.println(salary);
    }
}