import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int f=0,num;
        int a=0;
        int b=1;
        System.out.print("Enter a number for fibonacci : ");
        num=sc.nextInt();
        if (num==a){
            System.out.println(a);
        } else if (num==b) {
            f=1;
            System.out.println(b);
        }
        else {
            for (int i=2;i<=num;i++){
                f=a+b;
                a=b;
                b=f;

            }
        }
        System.out.println(f);
    }
}
