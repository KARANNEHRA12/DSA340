public class fibonacci {
    public static int fibHelper(int n, int dp[]) {

        if (n == 0 || n == 1)
            return n;
        // step 3 check if there is value present or not
        if (dp[n] != -1)
            return dp[n];

        // step 2 store the value in array
        dp[n] = fibHelper(n - 1, dp) + fibHelper(n - 2, dp);
        return dp[n];

    }

    public static void main(String[] args) {
        int n = 10;
        // Step 1 create and intiliaze AN ARRAY
        int dp[] = new int[n + 1];
        for (int i = 0; i < n; i++)
            dp[i] = -1;

        int ans = fibHelper(n, dp);
        System.out.println(ans);
    }

}
