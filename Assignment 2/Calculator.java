import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.print("Enter any symbol mentioned here + - * /  : " );
        String symbol=sc.next();

        //Checking
        if (Objects.equals(symbol, "+")){
            int cal=num1 + num2;
            System.out.println(cal);
        }
        else if (Objects.equals(symbol, "-")) {
            int cal=num1 - num2;
            System.out.println(cal);
        }
        else if (Objects.equals(symbol, "*")) {
            int cal=num1 * num2;
            System.out.println(cal);
        }
        else if (Objects.equals(symbol, "/")) {
            int cal=num1 / num2;
            System.out.println(cal);
        }
        else{
            System.out.println("Check the  symbol mentioned");
        }
    }
}
