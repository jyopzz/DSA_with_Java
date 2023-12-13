import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a =sc.nextInt();
        int b=sc.nextInt();
        for (int i=a+1;i<b;i++){
            int x=i;
            int n=0; //find number of digits
            while(x !=0){
                x=x/10;
                ++n;
            }
            double pow_sum=0;
            x=i;
            while(x!=0){
                int digit= x%10;
                pow_sum+=Math.pow(digit,n);
                x/=10;
            }
            if (pow_sum==i){
                System.out.println(i);
            }

        }


    }
}
