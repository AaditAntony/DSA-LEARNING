import java.util.Scanner;

public class LinearSearch {
    // searching using array

    public static void linear(int []arr, int n){
        boolean found=false;
       for(int num:arr){
           if(n==num){
               System.out.println("we have found the number :"+num);
               found=true;
               break;
           }

       }
        if (!found){
            System.out.println("not found");

        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("enter the value");
        Scanner sc= new Scanner(System.in);
     int n=sc.nextInt();
     linear(arr,n);
    }
}
