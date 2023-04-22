// Q Link L : https://practice.geeksforgeeks.org/problems/knapsack-with-duplicate-items4201/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
package UnboundedKnapsack;

// A= val. B- wt , C - capacity, n - size of val or wt
public class UBKnasack {
    public int KnapsackHelper(int[] A, int[] B, int C, int n, int[][] dp) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= C; j++) {
                if (n == 0 || C == 0) {
                    dp[i][j] = 0;
                }

            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= C; j++) {
                if (B[i - 1] <= j) {
                    // only line changed is below(*17)
                    dp[i][j] = Math.max(A[i - 1] + dp[i][j - B[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][C];
    }

}
