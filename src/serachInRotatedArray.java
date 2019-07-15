public class serachInRotatedArray {

    //there is always a half of the array sorted, so we only need to see whether the target is in the sorted part or rotated part
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            //if right part is monotonically increasing, or the pivot point is on the left part
            if (nums[mid] <= nums[high]) {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }
            // If left part is monotonically increasing, or the pivot point is on the right part
            else {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int search = new serachInRotatedArray().search(arr, 6);

        System.out.println(search);


    }
}
