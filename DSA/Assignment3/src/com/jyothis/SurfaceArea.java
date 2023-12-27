package com.jyothis;

import java.util.Scanner;

public class SurfaceArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Finding Surface area of the figures");
        System.out.println("Enter the option");
        System.out.println("1. Curved Surface Area Of Cylinder\n2. Total Surface Area Of Cube");
        int option=sc.nextInt();
        switch (option){
            case 1:
            {
                System.out.println("Enter the Radius of the Cylinder");
                int radius=sc.nextInt();
                System.out.println("Enter height of the Cylinder");
                int height=sc.nextInt();
                float surfacearea= (float) ((float) 2*(3.14)*radius*height);
                System.out.println("Curved Surface Area Of Cylinder ="+surfacearea);
            }
            break;
            case 2:
            {
                System.out.println("Enter the side of the Cube");
                int a=sc.nextInt();
                float surfacearea= 6*(a*a);
                System.out.println("Total Surface Area Of Cube ="+surfacearea);
            }
            break;
            default:
            {
                System.out.println("Enter a valid option");
            }
        }
    }
}
