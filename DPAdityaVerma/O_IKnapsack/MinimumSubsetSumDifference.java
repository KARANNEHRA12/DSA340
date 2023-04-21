package O_IKnapsack;
// Q: You are given an integer array nums of 2 * n integers. You need to partition nums into two arrays of length n to minimize the absolute difference of the sums of the arrays. To partition nums, put each element of nums into one of the two arrays.

// Return the minimum possible absolute difference.

// Input: nums = [3,9,7,3]
// Output: 2

// Input: nums = [-36,36]
// Output: 72

// not  able to handle negative number in array
public class MinimumSubsetSumDifference {

    public boolean SubsetHelper(int[] a, int n, int sum) {
        // The value of subset[i][j] will be
        // true if there is a subset of
        // set[0..j-1] with sum equal to i
        boolean dp[][] = new boolean[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (i == 0)
                    dp[i][j] = false;
                if (j == 0)
                    dp[i][j] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (a[i - 1] <= j)
                    dp[i][j] = dp[i - 1][j - a[i - 1]] || dp[i - 1][j];
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[n][sum];

    }

    public int getrange(int [] arr){
            int minSum = arr[0], maxSum = arr[0], currentSum = arr[0];
    
    for (int i = 1; i < arr.length; i++) {
        currentSum += arr[i];
        minSum = Math.min(minSum, currentSum);
        maxSum = Math.max(maxSum, currentSum);
    }
    return 
        }

    public int minimumDifference(int[] nums) {
        int range = 0;
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            range += nums[i];
        }

        for (int j = 0; j <= range / 2; j++) {
            if (SubsetHelper(nums, n, j)) {
                ans.add(Math.abs(range - (2 * j)));
            }

        }
        for (int k : ans) {
            min = Math.min(min, k);
        }
        return min;

    }

}
