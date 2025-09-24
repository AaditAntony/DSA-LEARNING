package java_logical_questions;

import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int sum =0;
        // Adding numbers form 1 to n
        for(int i=0;i<=n;i++){
            sum +=i;

        }
        System.out.println(" Sum of first " +n + " natural numbers = "+ sum);
        sc.close();
    }
}
