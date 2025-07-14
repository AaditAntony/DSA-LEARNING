public class MinMaxInArray {
    // Edge case: empty array

   public static  void findMinMax(int[]arr){
     // Edge case: empty array
       if(arr == null || arr.length==0){
           System.out.println("Array is empty.");
           return;
       }
        int max=Integer.MAX_VALUE;
        int min= Integer.MIN_VALUE;

        for(int num:arr){
          if(max > num){
max= num;
          }
          if(min < num){
              min=num;
          }
        }
       System.out.println("Maximum = "+max);
       System.out.println("Minimum = "+ min);
   }

    public static void main(String[] args) {
        int arr []={1,2,3,46};
        findMinMax(arr);
    }
}
