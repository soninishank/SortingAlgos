public class minimumElement {

    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        if (nums[low] < nums[high]) {
            return nums[low];
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < nums[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return nums[low];
    }


    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 3};
        int search = new minimumElement().findMin(arr);

        System.out.println(search);


    }
}
