import java.util.Arrays;

public class ReverseArray {

    // function to reverse an array

    static void reverseArray(int[] arr){
int left=0;
int right= arr.length-1;
while(left<right){
    //swap arr[left] and arr[right]
   int  temp=arr[left];
    arr[left]=arr[right];
    arr[right]=temp;

  left++;
    right--;
}
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }


}

