import java.util.Arrays;

public class rightRotation {

    public void rotateByRight(int[] arr, int k)
    {
        k %= arr.length;
        // we have to first reverse the whole array
        reverse(arr, 0, arr.length - 1);
        // After reversing first k numbers
        reverse(arr, 0, k - 1);
        ;

        // After revering last n-k numbers
        reverse(arr, k, arr.length - 1);

    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        int n = arr.length;


        System.out.println("My original array " + Arrays.toString(arr));

        new rightRotation().rotateByRight(arr, d); // 6, 7, 1, 2, 3, 4, 5
        // 3, 4, 5, 6, 7, 1, 2

        System.out.println("My reveresed array " + Arrays.toString(arr));



    }


}
