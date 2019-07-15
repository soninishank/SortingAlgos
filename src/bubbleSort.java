import java.util.Arrays;

public class bubbleSort {


    public static void main(String[] args) {
        bubbleSort bubbleSort = new bubbleSort();
        int arr[] = {2, 7, 4, 1, 5, 3};
        // selectionSort.sort(arr, arr.length);

        bubbleSort.sort(arr);

    }

    private void sort(int[] arr) {
        int num = arr.length;

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) // -i because on every passes the last element will get sorted
            {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            // IF no two elements were swapped by inner loop, then break
            if (swapped == false) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
