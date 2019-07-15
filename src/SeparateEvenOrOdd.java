import java.util.Arrays;

public class SeparateEvenOrOdd {


    public static void main(String[] args) {
        new SeparateEvenOrOdd();
        int arr[] = {1, 1, 3, 4, 6, 5, 7};
        int[] ints = evenOdd(arr, arr.length);
        System.out.println(Arrays.toString(ints));

    }

    private static int[] evenOdd(int[] arr, int length)
    {
        int low = 0, high = length - 1;
        while (low < high)
        {
            if (arr[low] % 2 == 0) {
                low++;
            }
            else
                {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high--] = temp;
            }
        }
        return arr;
    }


}
