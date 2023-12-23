package com.jyothis;



public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a,b);
        {
            int c=99;
            // we can only call the c in this block
        }
        //System.out.println(c); // it gives an  error

        //Scoping in for loop
        for (int i=0;i<5;i++){
            System.out.println(i);
        }
        //System.out.println(i); i cannot call outside of the loop scope


    }

    static void swap(int a, int b) {
        int temp=a;
        a=b;
        b=temp;
        //This change will only be in valid in this function scope
    }

}
