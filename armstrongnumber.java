package whileloop;

import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        System.out.println("enter your number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2=num;
        int dig1 = 0;
        int dig2 = 0;
        int dig3 = 0;
        int dd=0;
        while (num != 0) {

            dig1=num2/100;
            dig3=num%10;
            dd=num/10;
            dig2=dd%10;

            num = num / 1000;
            System.out.println(dig1);
            System.out.println(dig2);
            System.out.println(dig3);


        }
        int sum= dig3*dig3*dig3+dig2*dig2*dig2+dig1*dig1*dig1;
        if (sum==num2){
            System.out.println(sum);
            System.out.println("armstrongnumber number");
        }
        else
            System.out.println("no");






    }
}
