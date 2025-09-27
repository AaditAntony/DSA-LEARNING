package java_logical_questions;

import java.util.Scanner;

public class PrimeNumberRecursive
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number");
        int num = sc.nextInt();
        if(isPrime(num,2)) System.out.println(num + " : is a prime number");
        else System.out.println( num + " : is not a prime number");
    }
    static boolean isPrime(int n,int i){
        if(n<1) return false;
        if(i>Math.sqrt(n)) return true;  // no divisor found
        if(n%i==0) return false;    // divisor found
        return  isPrime(n,i+1);  // recursive found
    }
}
