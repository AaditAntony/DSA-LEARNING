package sorting;

public class RadixSort {

    // Function to get the maximum value in arr[]
    static int getMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // A function to do Counting Sort of arr[] according to the digit represented by exp
    static void countingSort(int arr[], int exp) {
        int n = arr.length;
        int output[] = new int[n]; // output array
        int count[] = new int[10]; // because digits are 0-9

        // Step 1: Count occurrences of digits
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        // Step 2: Change count[i] so that it contains actual position of this digit
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Build the output array (stable sorting - go from right to left)
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Step 4: Copy output[] to arr[]
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // The main Radix Sort function
    static void radixSort(int arr[]) {
        int max = getMax(arr);

        // Do counting sort for every digit (exp = 1, 10, 100, ...)
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    // Utility function to print an array
    static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Driver Code
    public static void main(String args[]) {
        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};

        System.out.println("Original Array:");
        printArray(arr);

        radixSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
