package whileloop;

public class fivetable {
    public static void main(String[] args) {
        System.out.println("Table of Five is ");
        int count=1;
        int ans=0;
        while (count<=10){
            ans=count*5;
            System.out.println("5*"+count+"="+ans);
            count++;
        }


    }
}
