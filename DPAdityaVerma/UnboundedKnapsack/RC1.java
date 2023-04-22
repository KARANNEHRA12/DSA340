// QLink : https://practice.geeksforgeeks.org/problems/rod-cutting0840/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
package UnboundedKnapsack;

public class RC1 {
    class Solution {
        // a= val, c- cpacity (N), n - length of price
        public static int KnapsackHelper(int[] A, int C, int n, int[][] dp) {
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= C; j++) {
                    if (n == 0 || C == 0) {
                        dp[i][j] = 0;
                    }

                }
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= C; j++) {
                    if (i <= j) {
                        // only line changed is below(*17)
                        dp[i][j] = Math.max(A[i - 1] + dp[i][j - i], dp[i - 1][j]);
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }

            return dp[n][C];

        }

        public int cutRod(int price[], int n) {

            int pl = price.length;
            int[][] dp = new int[pl + 1][n + 1];
            return KnapsackHelper(price, n, pl, dp);

        }
    }
}