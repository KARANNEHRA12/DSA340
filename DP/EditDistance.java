public class EditDistance {
    public int minDistanceHelper(String a, String b, int i, int j, int[][] dp) {
        if (i == a.length())
            // if length of the string a is less than b then we have to add those element of
            // b
            return b.length() - j;
        if (j == b.length())
            return a.length() - i;
        int ans = 0;
        if (dp[i][j] != 0)
            return dp[i][j];
        if (a.charAt(i) == b.charAt(j)) {
            return minDistanceHelper(a, b, i + 1, j + 1, dp);
        } else {

            int InsertAns = 1 + minDistanceHelper(a, b, i, j + 1, dp);
            int DeleteAns = 1 + minDistanceHelper(a, b, i + 1, j, dp);
            int ReplaceAns = 1 + minDistanceHelper(a, b, i + 1, j + 1, dp);
            ans = Math.min(InsertAns, Math.min(ReplaceAns, DeleteAns));
        }
        return dp[i][j] = ans;
    }

    public int minDistance(String word1, String word2) {
        int n = Math.max(word1.length(), word2.length());
        int[][] dp = new int[word1.length()][word2.length()];
        int ans = minDistanceHelper(word1, word2, 0, 0, dp);
        return ans;
    }
}
