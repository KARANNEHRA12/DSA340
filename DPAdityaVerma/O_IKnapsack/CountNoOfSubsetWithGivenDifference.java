package O_IKnapsack;
public class CountNoOfSubsetWithGivenDifference {

    public int SubsetHelper(ArrayList<Integer> a, int n, int sum) {
        // The value of subset[i][j] will be
        // true if there is a subset of
        // set[0..j-1] with sum equal to i
        int dp[][] = new int[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (i == 0)
                    dp[i][j] = 0;
                if (j == 0)
                    dp[i][j] = 1;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (a.get(i - 1) <= j)
                    dp[i][j] = dp[i - 1][j - a.get(i - 1)] + dp[i - 1][j];
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[n][sum];

    }

    public int subsetWithGivenDifference(ArrayList<Integer> nums, int differnce) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int s1 = (differnce + sum) / 2;
        return SubsetHelper(nums, differnce, s1);

    }

}
