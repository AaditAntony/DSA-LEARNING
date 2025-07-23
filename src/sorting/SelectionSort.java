package sorting;

public class SelectionSort {
    public static void selectionSort(int []arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
for(int j=i+1;j<n;j++){
    if(arr[j]<arr[minIndex]){
        minIndex=j;
    }
}
int temp= arr[minIndex];
arr[minIndex]=arr[i];
arr[i]=temp;
        }
    }

    public static void main(String[] args) {
        int arr[]={29,10,14,37,13};
        selectionSort(arr);
        for(int num:arr){
            System.out.println(num+"");
        }
    }
}

// ❌ Not good for production level code

// ❗ While Selection Sort is slightly better than Bubble Sort in terms of swaps,
// it still has a time complexity of O(n²) in all cases.

/*
    ❌ Why Selection Sort Is Not Used in Production

    1. Always O(n²)
       - No matter the input (sorted or not), it always performs O(n²) comparisons.
       - Does not benefit from partially sorted data.

    2. Too Many Comparisons
       - Even though swaps are fewer, it performs a large number of comparisons.

    3. Not Efficient for Large Data
       - Inefficient and slow when array size is large.
       - Doesn't scale in real-world applications.

    4. No Adaptive Behavior
       - Cannot detect if array is already sorted.
       - Executes full loops regardless of current state.

    5. Not Used in Standard Libraries
       - Java, Python, C++ use faster and optimized sorting algorithms like Merge Sort, Quick Sort, or TimSort.

    ✅ When is Selection Sort Okay?
       - For learning sorting algorithms
       - Small datasets where swap count is critical
       - When memory writes are expensive (e.g., EEPROMs)

    🧠 Summary:
       Selection Sort is simple and stable for understanding sorting basics,
       but is inefficient for real production environments or large datasets.
*/