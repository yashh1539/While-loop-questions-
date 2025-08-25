package whileloop;

import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter your number");
        int count= scan.nextInt();
        int val= 1;
        int sum=0;
        while (val<=count){
            sum= sum+val;
           val=val+1;
        }
        System.out.println(sum);
    }
}
