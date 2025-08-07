package sorting;



public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;  // the middle point

            // sort the first half
            mergeSort(arr, left, mid);

            // sort the second half
            mergeSort(arr, mid + 1, right);

            // merge the two halves
            merge(arr, left, mid, right);
        }
    }

    // function to merge two sorted halves
    public static void merge(int[] arr, int left, int mid, int right) {
        // find the sizes of two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // merge the temp arrays back into arr[left...right]
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // copy remaining elements of L[]
        while (i < n1) {
            arr[k++] = L[i++];
        }

        // copy remaining elements of R[]
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    // Main method to test the code
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6, 3};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
