import java.util.Arrays;

public class mergeSort {

    private void sort(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int left[] = new int[mid - 1];
        int right[] = new int[n - mid];

        for (int i = 0; i < mid - 1; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n - 1; i++) {
            right[i - mid] = arr[i];
        }
        sort(left);
        sort(right);
        merge(left, right, arr);
        System.out.println(Arrays.toString(arr));
    }

    private void merge(int[] left, int[] right, int[] arr) {
        int leftLength = left.length;
        int rightLength = right.length;
        int leftIndex = 0, rightIndex = 0, mergeIndex = 0;

        while (leftIndex < leftLength && rightIndex < rightLength) {
            if (left[leftIndex] <= right[rightIndex]) {
                arr[mergeIndex] = left[leftIndex];
                leftIndex++;
            } else {
                arr[mergeIndex] = right[rightIndex];
                rightIndex++;
            }
            mergeIndex++; // Increament merge Index also
        }

        while (leftIndex < leftLength) {
            arr[mergeIndex] = left[leftIndex];
            leftIndex++;
            mergeIndex++; // Increament merge Index also
        }
        while (rightIndex < rightLength) {
            arr[mergeIndex] = right[rightIndex];
            rightIndex++;
            mergeIndex++; // Increament merge Index also
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        mergeSort mergeSort = new mergeSort();
        int arr[] = {7, 2, 4, 1, 5, 3};
        // selectionSort.sort(arr, arr.length);

        mergeSort.sort(arr);


    }


}
