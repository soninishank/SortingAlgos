import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;

public class insertionSort {


    public static void main(String[] args) {
        insertionSort insertionSort = new insertionSort();
        int arr[] = {7, 2, 4, 1, 5, 3};
        // selectionSort.sort(arr, arr.length);
        insertionSort.sort(arr);
    }

    private void sort(int[] arr)
    {
        for (int i = 1; i < arr.length ; i++)  // i will start from 1
        {
            int value = arr[i];  // 2
            int hole_index = i ; // 1

            while (hole_index > 0 && arr[hole_index - 1] > value) //  1 > 0 && 7 > 2      condition true
            {
                arr[hole_index] = arr[hole_index -1]; // save the imaginary value that is 7 at where arr[hole_index] = 2 so now arr[hole_index] will become 7
                hole_index = hole_index - 1 ; // Reduce the hole_index
            }
            arr[hole_index] = value ; // save 2 at arr[hole_index] where hole_index is 0 because we reduced in while loop
        }
        System.out.println(Arrays.toString(arr));


    }
}
