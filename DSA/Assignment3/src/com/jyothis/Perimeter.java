package com.jyothis;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Find perimeter of the given figures");
        System.out.println("Enter the option to find the perimeter of the figures");
        System.out.println("1. Circle\n2. Equilateral Triangle\n3. Parallelogram\n4. Rectangle\n5. Square\n6. Rhombus");
        int option=sc.nextInt();
        switch (option){
            case 1:
            {
                System.out.println("Enter the radius of the circle");
                int radius=sc.nextInt();
                float perimeter=(float) (2*3.14)*radius;
                System.out.println("Perimeter of the circle = "+perimeter);
            }
            break;
            case 2:
            {
                System.out.println("Enter the length of side of the Equilateral Triangle");
                int a=sc.nextInt();
                int perimeter=3*a;
                System.out.println("Perimeter of the Equilateral Triangle = " +perimeter);
            }
            break;
            case 3:
            {
                System.out.println("Enter the length of base and side of the Parallelogram");
                int base=sc.nextInt();
                int side=sc.nextInt();
                int perimeter=2*(base*side);
                System.out.println("Perimeter of the Parallelogram = "+perimeter);
            }
            break;
            case 4:
            {
                System.out.println("Enter the length of base and side of the Rectangle");
                int base=sc.nextInt();
                int side=sc.nextInt();
                int perimeter=2*(base*side);
                System.out.println("Perimeter of the Rectangle = "+perimeter);
            }
            break;
            case 5:
            {
                System.out.println("Enter the length of side of the Square");
                int side=sc.nextInt();
                int perimeter=4*side;
                System.out.println("Perimeter of the Square = "+perimeter);
            }
            break;
            case 6:
            {
                System.out.println("Enter the length of side of the Rhombus");
                int side=sc.nextInt();
                int perimeter=4*side;
                System.out.println("Perimeter of the Rhombus = "+perimeter);
            }
            break;
            default:
            {
                System.out.println("Enter a valid option");
            }

        }

    }
}
