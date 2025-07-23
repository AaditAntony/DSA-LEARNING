package sorting;

public class BubleSort {
    static  void bubleSort(int []arr){
        int n= arr.length;
        boolean swapped;
        for(int i=0;i<n-1;i++){
            swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
    }

    public static void main(String[] args) {
        int []arr={5,3,1,4,2};
        bubleSort(arr);
        for(int num:arr){
            System.out.println(num+"");
        }
    }
}

// its not good for the production level code

// as if the array is already sorted it will perform the bestcase  else the average and the worst case is 	O(n²)

/*
    ❌ Why Bubble Sort Is Not Used in Production

    1. Very Poor Time Complexity
       - Worst-case: O(n^2)
       - Average-case: O(n^2)
       - Makes too many comparisons and swaps even for medium-sized arrays.

    2. Too Slow for Large Data
       - Extremely inefficient for large datasets.
       - Cannot scale for real-time systems or production environments.

    3. Repeated Passes Even on Sorted Arrays
       - Without optimization, it blindly runs every pass.
       - Even with a swap-check flag, it still performs many unnecessary operations.

    4. Not Adaptive or Efficient
       - Doesn’t adjust behavior based on how sorted the data already is.
       - Insertion Sort, Merge Sort, and Quick Sort adapt better.

    5. Not Used in Real Libraries
       - Java, Python, and other languages use TimSort, QuickSort, etc.
       - These algorithms are highly optimized for real-world performance.

    ✅ When is Bubble Sort Okay?
       - Teaching algorithm logic (simple to understand)
       - Small arrays (e.g., <10 elements)
       - Visualization tools for educational purposes

    🧠 Summary:
       Bubble Sort is a great tool to learn how sorting works,
       but it’s not suitable for use in production code.
*/
