package O_IKnapsack;
// Q: Given an integer array nums, return true if you can partition the array into two subsets such that the sum of the elements in both subsets is equal or false otherwise.
// Input: nums = [1,5,11,5]
// Output: true

public class EqualSumPartition {
    public boolean SubsetHelper(ArrayList<Integer> a, int n, int sum) {
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
                if (a.get(i - 1) <= j)
                    dp[i][j] = dp[i - 1][j - a.get(i - 1)] || dp[i - 1][j];
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[n][sum];

    }

    public boolean EqualSumPartitionhelper(ArrayList<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums[i];
        }
        if (sum % 2 == 0)
            return SubsetHelper(nums, nums.length, sum);
        else
            return false;

    }

}
