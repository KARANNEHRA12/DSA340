package UnboundedKnapsack;
// Q: Given a rod of length n  and array prices of length n denoting the cost of pieces of the rod of length 1 to n, find the maximum amount that can be made if the rod is cut up optimally.

// Input 1:

// n = 8, prices[] = [1, 3, 4, 5, 7, 9, 10, 11]

// Output 1:

// 12

public class Rodcutting {

    // recursive
    public static int maximumProfit(int[] prices, int n) {
        if (n == 0) {
            return 0;
        }
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            maxProfit = Math.max(maxProfit, prices[i - 1] + maximumProfit(prices, n - i));
        }
        return maxProfit;
    }
    // r + M

    public static int maximumProfit(int[] prices, int n, int[] dp) {
        if (n == 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            maxProfit = Math.max(maxProfit, prices[i - 1] + maximumProfit(prices, n - i, dp));
        }
        return dp[n] = maxProfit;
    }

    public static int getMaxProfit(int[] a, int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        return maximumProfit(a, n, dp);
    }

    // top-down
    public static int maximumProfit(int[] prices, int n) {
        int[] dp = new int[n + 1];
        if (n <= 0) {
          return 0;
        }
        int maxVal = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
          for (int j = 0; j < i; j++) {
            maxVal = Math.max(maxVal, prices[j] + dp[i - j - 1]);
          }
          dp[i] = maxVal;
        }
        return dp[n];
      }

}
