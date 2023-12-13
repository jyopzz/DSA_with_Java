import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string to check Palindrome or not : ");
        String str=sc.nextLine();
        str=str.toLowerCase();
        StringBuilder reversestr= new StringBuilder();
        for (int i=str.length()-1;i>=0;i--){
            reversestr.append(str.charAt(i));
        }
        if (reversestr.toString().equals(str)){
            System.out.println( str+" is a palindrome");
        }
        else {
            System.out.println( str+" is a not palindrome");
        }

    }
}
