//Q: https://leetcode.com/problems/unique-paths/submissions/954013766/
// import java.util.Arrays;

import java.util.Arrays;

public class GridPath {
//    static  int [][] dp = new int[m+1][n+1];
    public int countPath( int i , int j , int m ,int n,  int [][] dp ){
        if( i == m-1  && j== n-1) return 1;
        if( i >= m || j>= n ) return 0;
         if( dp[i][j] != -1)
              return  dp[i][j];
        dp[i][j] =  countPath(i+1, j , m, n ,dp ) + countPath(i, j+1, m,n ,dp);
         return  dp[m][n];

    }
    public int Cp(int m , int n){
        int N = n + m - 2;
        int r = m - 1;
        double res = 1;
//  NcR =  10 C 3 = (10 * 9 * 8 )/ (3 * 2 * 1)
        for (int i = 1; i <= r; i++)
            res = res * (N - r + i) / i;
        return (int)res;
    }
    public int uniquePaths(int m, int n) {
     int [][] dp = new int[m+1][n+1];
        for (int[] ans : dp   ) {
            Arrays.fill(ans, -1);

        }
         return countPath(0, 0, m ,n, dp);

    }
}
