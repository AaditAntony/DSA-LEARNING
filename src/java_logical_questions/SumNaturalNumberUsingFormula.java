package java_logical_questions;

import java.util.Scanner;

public class SumNaturalNumberUsingFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
         int n = sc.nextInt();

         // this is the formula to calculate the sum more fast and efficent

        int s = n*(n+1)/2;

        System.out.println( "sum of first "+ " natural numbers = "+ s);
        sc.nextInt();
    }

}
