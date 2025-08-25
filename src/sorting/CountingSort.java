package sorting;

public class CountingSort {

    public static void countingSort(int[] arr) {
        // Step 1: Find the maximum element
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // Step 2: Create a count array
        int[] count = new int[max + 1];

        // Step 3: Count the frequency of each element
        for (int num : arr) {
            count[num]++;
        }

        // Step 4: Modify count array (prefix sum)
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Step 5: Build the output array (stable sorting)
        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Step 6: Copy sorted array back to original
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        countingSort(arr);

        System.out.println("\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
