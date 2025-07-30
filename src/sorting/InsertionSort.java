package sorting;

public class InsertionSort {
   public  static void insertionSort(int []arr){
       int n= arr.length;
       for(int i=1;i<n;i++) {
           int key = arr[i];
           int j = i - 1;

           while (j >= 0 && arr[j] > key) {
               arr[j + 1] = arr[j];
               j--;
           }
           arr[j + 1] = key;
       }
   }
    public static void main(String[] args) {
        int arr[]={5,3,1,4,2};
        insertionSort(arr);
        for(int num:arr){
            System.out.println(num +"");
        }
    }
}

/*
    ❌ Why Insertion Sort is not commonly used in production:

    1. Poor Time Complexity for large arrays
       - Worst-case: O(n²) when array is in reverse order
       - Average-case: O(n²)

    2. Too slow for large datasets
       - Not suitable for real-time or large-scale production systems

    3. Performs unnecessary comparisons for unsorted data

    ✅ When Insertion Sort is Useful:

    1. Small datasets (especially < 10 elements)
    2. Partially sorted data
       - Best-case: O(n) when array is already sorted

    3. Easy to implement
       - Simple logic, great for understanding how sorting works

    4. Stable sort
       - Maintains the relative order of equal elements

    5. In-place algorithm
       - No need for extra memory (space complexity O(1))

    📚 Summary:
       Insertion Sort is better than Bubble and Selection sort in many real-world small array cases.
       It's used internally by more complex algorithms like TimSort for small partitions.
       However, for larger data, prefer Merge Sort, Quick Sort, or in-built sorting functions.
*/
