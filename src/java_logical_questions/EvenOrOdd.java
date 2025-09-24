package java_logical_questions;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);  // for entering the value
        System.out.println("Enter the number");
        int num= sc.nextInt();  // for storing the value entered by the user
        if(num%2==0){
            System.out.println(num+" is Even");
        }
        else {
            System.out.println(num +" is odd");
        }
        sc.close();
    }

}
