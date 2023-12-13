import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter the number to check Even or Odd : ");
        int num=input.nextInt();
        if (num % 2==0){
            System.out.println(num +" is an even number");
        }
        else {
            System.out.println(num+ " is an odd number");
        }
    }
}
