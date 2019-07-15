import java.util.Arrays;

public class LeftRotation {

    public void leftRotate(int[] arr, int k) {
        int num = arr.length;
        k %= num;
        reverse(arr, 0, num - 1); // original array reversed
        reverse(arr, num - k, num - 1);// Reversing only last k numbers that you will get by num - k
        reverse(arr, 0, num - k - 1); // No reverse before k
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

        new LeftRotation().leftRotate(arr, d); //  // 3, 4, 5, 6, 7, 1, 2

        System.out.println(Arrays.toString(arr));


    }


}
