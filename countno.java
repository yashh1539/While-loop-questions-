package whileloop;

import java.util.Scanner;

public class countno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int num = scan.nextInt();
        int temp = Math.abs(num); // handle negative numbers

        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
    }
}

