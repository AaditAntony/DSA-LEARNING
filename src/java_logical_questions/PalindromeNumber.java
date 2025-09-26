package java_logical_questions;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num= sc.nextInt();

        int original=num;
        int reverse = 0;

        //Reverse logic
        while(num!=0){
            int digit = num%10;
            reverse= reverse*10+digit;
            num=num/10;
        }

        // check palindrome
        if(original==reverse){
            System.out.println(original+" is a palindrome number");
        }else {
            System.out.println(original+" is not a palindrome number");
        }
        sc.close();
    }
}
