package com.joseph;

import java.util.Scanner;

public class Depreciation_Value {
    public static void main(String[] args) {
        System.out.println("1.Straight-line depreciation\n2.Double-declining balance depreciation\n3.Sum-of-the-year digits depreciation\n4.Units of production depreciation");
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        switch (option){
            case 1:
            {
                System.out.println("Straight-line depreciation");
                System.out.println("Enter asset cost");
                int cost=sc.nextInt();
                System.out.println("Salvage value of System");
                int salvage=sc.nextInt();
                System.out.println("Enter useful life (in years)");
                int usefullife=sc.nextInt();
                int depreciation=(cost-salvage)*usefullife;
            }
            case 2:
            {

            }
        }

    }
}
