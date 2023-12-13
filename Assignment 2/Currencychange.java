import java.util.Scanner;

public class Currencychange {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to convert INR to USD : ");
        int rs=sc.nextInt();
        //Calculation
        double usd=rs*0.012;
        System.out.println("USD = "+usd);

    }
}
