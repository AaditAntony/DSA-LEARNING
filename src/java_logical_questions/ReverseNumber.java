package java_logical_questions;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int  num= sc.nextInt();
        int reversed =0;

        while(num!=0){
            int digit = num%10;
            reversed=reversed*10+digit;
            num=num/10;

        }
        System.out.println("Reverse number = "+reversed);
        sc.close();
    }
}
