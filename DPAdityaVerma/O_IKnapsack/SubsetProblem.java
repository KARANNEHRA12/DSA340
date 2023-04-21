package O_IKnapsack;
// Q:Given an integer array A  of size N.

// You are also given an integer B, you need to find whether their exist a subset in A whose sum equal B.

// // If there exist a subset then return true else return false.
// Input 1:

//  A = [3, 34, 4, 12, 5, 2]
//  B = 9
// Input 2:

//  A = [3, 34, 4, 12, 5, 2]
//  B = 30

//  Output 1:

//  true
// Output 2:

//  false 

public class SubsetProblem {
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

}
