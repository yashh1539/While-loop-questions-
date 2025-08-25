package whileloop;

import java.util.Scanner;

public class palindromes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int number= scan.nextInt();
        int orignal=number;
        int reverse=0;
        System.out.println(120%10);
        while (number!=0){
            int dig= number%10;
            reverse= reverse*10+dig;
            number=number/10;


        }
        if (orignal==reverse){
            System.out.println("number is palindromes");
        }
        else
            System.out.println("number is not palindroms");


    }


}
