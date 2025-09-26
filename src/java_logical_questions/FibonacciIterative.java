package java_logical_questions;

import java.util.Scanner;

public class FibonacciIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n= sc.nextInt();

        int a=0; int b=1;
        for(int i=1;i<=n;i++){
            System.out.println(a+""); // print current number
            int next =a+b;
            a=b;
            b= next;
        }
        sc.close();
    }
}
