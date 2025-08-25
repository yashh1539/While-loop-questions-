package whileloop;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;           // get the last digit
            reversed = reversed * 10 + digit; // append it to reversed
            num = num / 10;                 // remove the last digit
        }

        System.out.println("Reversed number: " + reversed);
    }
}
