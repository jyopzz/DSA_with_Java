package com.jyothis;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Find Volume of the given figures");
        System.out.println("Enter the option to find the Volume of the figures");
        System.out.println("1. Circular cone\n2. Prism\n3. Cylinder\n4. Sphere\n5. Pyramid");
        int option=sc.nextInt();
        switch (option){
            case 1:
            {
                System.out.print("Enter the radius of the Circular cone : ");
                int radius=sc.nextInt();
                System.out.print("Enter the height of the Circular cone : ");
                int height=sc.nextInt();
                float volume=(float) 3.14*(radius*radius)*((float) height /3);
                System.out.println("Volume of the Circular cone = "+volume);
            }
            break;
            case 2:
            {
                System.out.print("Enter the base of the Prism : ");
                int base=sc.nextInt();
                System.out.print("Enter the height of the Prism : ");
                int height=sc.nextInt();
                float volume=base*height;
                System.out.println("Volume of the Prism = "+volume);
            }
            break;
            case 3:
            {
                System.out.print("Enter the radius of the Cylinder : ");
                int radius=sc.nextInt();
                System.out.print("Enter the height of the Cylinder : ");
                int height=sc.nextInt();
                float volume=(float) 3.14*(radius*radius)*height;
                System.out.println("Volume of the Cylinder = "+volume);
            }
            break;
            case 4:
            {
                System.out.print("Enter the radius of the Sphere : ");
                int radius=sc.nextInt();
                float volume= (float) ((float) (4/3) * 3.14*(radius*radius));
                System.out.println("Volume of the Sphere = "+volume);
            }
            break;
            case 5:
            {
                System.out.print("Enter the Base of the Pyramid : ");
                int base=sc.nextInt();
                System.out.print("Enter the height of the pyramid : ");
                int height=sc.nextInt();
                float volume=(float) 0.333* base *height;
                System.out.println("Volume of the pyramid = "+volume);
            }
            break;
            default:
            {
                System.out.println("Enter a valid options");
            }
    }
}

}
