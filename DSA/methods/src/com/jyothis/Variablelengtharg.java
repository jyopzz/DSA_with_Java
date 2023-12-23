package com.jyothis;

import java.util.Arrays;

public class Variablelengtharg {
    public static void main(String[] args) {
        fun(1,2,3,45,6,7,8);
        mularg(1,8,9,8,7,7,9);
    }
    static void fun(int ...x){  //if we dont know how many integer are passing;   Variable length arguments
        System.out.println(Arrays.toString(x));

    }
    static void mularg(int a, int b, int ...x){ //mix of arguments  Variable length argunment should be last
    }
}
