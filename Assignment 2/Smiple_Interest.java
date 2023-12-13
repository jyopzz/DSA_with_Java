import java.util.Scanner;

public class Smiple_Interest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Calculating Simple interest");
        System.out.print("Enter the Principle Amount : ");
        int p=sc.nextInt();
        System.out.print("Enter Rate of Interest : ");
        float r =sc.nextFloat();
        System.out.print("Enter Number of years : ");
        int t=sc.nextInt();
        //Calculations
        float SI=(p*t*r)/100;
        System.out.println("The Simple Interest of the Amount for "+t+" years is "+SI);
    }
}
