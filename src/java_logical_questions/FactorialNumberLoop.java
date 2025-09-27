package java_logical_questions;

import java.util.Scanner;

public class FactorialNumberLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        long fact =1; // using long to hnadle large result
        for(int i=1;i<n;i++){
            fact *=i;

        }
        System.out.println(" Factorial of "+n+ " = "+ fact);
    }
}
