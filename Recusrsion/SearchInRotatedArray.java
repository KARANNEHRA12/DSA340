package Recusrsion;

public class SearchInRotatedArray {
    public int searchHelper(int[] nums, int low, int high, int key) {
        if (low > high) {
            return -1;

        }
        int mid = (low + high) / 2;
        if (nums[mid] == key)
            return mid;
        if (nums[low] <= nums[mid]) {
            if (key >= nums[low] && key <= nums[mid])
                return searchHelper(nums, low, mid - 1, key);

            return searchHelper(nums, mid + 1, high, key);

        }
        if (key >= nums[mid] && key <= nums[high])
            return searchHelper(nums, mid + 1, high, key);

        return searchHelper(nums, low, mid - 1, key);
    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        return searchHelper(nums, 0, n - 1, target);

    }

}
