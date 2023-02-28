public class MinimumCostClimbingStairs {
    public int minCostClimbingStairsHelper(int[] cost, int n, int dp[]) {
        if (n == 0)
            return cost[0];
        if (n == 1)
            return cost[1];
        if (dp[n] != 0)
            return dp[n];

        dp[n] = cost[n]
                + Math.min(minCostClimbingStairsHelper(cost, n - 1, dp), minCostClimbingStairsHelper(cost, n - 2, dp));

        return dp[n];
    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n + 1];
        int ans = Math.min(minCostClimbingStairsHelper(cost, n - 1, dp), minCostClimbingStairsHelper(cost, n - 2, dp));
        return ans;
    }
}
