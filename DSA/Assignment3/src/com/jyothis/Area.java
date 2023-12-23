package com.jyothis;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Area of the given figures");
        System.out.println("Select a option");
        System.out.println("1 Circle \n2 Triangle\n3 Rectangle\n4 Isosceles Triangle\n5 Parallelogram\n6 Rhombus\n7 Equilateral Triangle");
        int option= sc.nextInt();
        switch (option){
            case 1:{
                System.out.print("Enter the radius of the circle : ");
                int radius= sc.nextInt();
                float Area= (float) (3.14 *(radius*radius));
                System.out.println("Area of the circle = "+Area);
            }
            break;
            case 2,4: //options for triangle and isosceles triangle
            {
                System.out.print("Enter the base and height of the Triangle : ");
                int base= sc.nextInt();
                int height=sc.nextInt();
                float Area= (float) (0.5 *(base*height));

                if (option==2){
                    System.out.println("Area of the Triangle = "+Area);
                }
                else {
                    System.out.println("Area of the Isosceles Triangle = "+Area);
                }
            }
            break;
            case 3,5:
            {
                if (option==3){
                    System.out.print("Enter the base and height of the Rectangle : ");
                }
                else {
                    System.out.print("Enter the base and height of the Parallelogram : ");
                }
                int base= sc.nextInt();
                int height=sc.nextInt();
                float Area= base*height;

                if (option==3){
                    System.out.println("Area of the Rectangle = "+Area);
                }
                else {
                    System.out.println("Area of the Parallelogram= "+Area);
                }
            }

            break;
            case 6:
            {
                System.out.print("Enter the length of the diagonals of a Rhombus : ");
                int d1=sc.nextInt();
                int d2=sc.nextInt();
                float Area=(float) 0.5*(d1*d2);
                System.out.println("Area of the Rhombus = "+Area);
            }
            break;
            case 7:
            {
                System.out.print("Enter the side of the Equilateral Triangle : ");
                int a=sc.nextInt();
                float Area= (float) (1.73205080757/4)*(a*a);
                System.out.println("Area of the Equilateral Traingle is : "+Area);
            }
            break;
            default:
                System.out.println("Enter a valid option");

        }


    }
}