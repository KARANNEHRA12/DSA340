package O_IKnapsack;
// Q: Given two integer arrays A and B of size N each which represent values and weights associated with N items respectively.

// Also given an integer C which represents knapsack capacity.

// Find out the maximum value subset of A such that sum of the weights of this subset is smaller than or equal to C.

// NOTE:

// You cannot break an item, either pick the complete item, or don’t pick it (0-1 property).

// Input 1:

//  A = [60, 100, 120]
//  B = [10, 20, 30]
//  C = 50
// Input 2:

//  A = [10, 20, 30, 40]
//  B = [12, 13, 15, 19]
//  C = 10

//  Output 1:

//  220
// Output 2:

//  0



// recursive code
int Knapsack( int [] wt, int val,int n, int C ){
    if( n == 0 || C ==0 ){
        return 0;

    }
    if( wt[n-1] <= C)
     return Math.max( val[n-1] + Knapsack(wt, val, n-1, C = wt[n-1]) , Knapsack( wt, val, n-1 , C));

     else {
        return Knapsack(wt, val, n-1 ,C);
     }
}

// recursive + Memoization
 static int [][] dp = new int [ n+1][C+1];
 for( int [] arr : dp)
 {Arrays.fill(arr, -1);}

 int Knapsack( int [] wt, int val,int n, int C ){
    if( n == 0 || C ==0 ){
        return 0;

    }
    if(dp[n][C] != -1)
    return dp[n][C];

    if( wt[n-1] <= C)
     dp[n][C] = Math.max( val[n-1] + Knapsack(wt, val, n-1, C = wt[n-1]) , Knapsack( wt, val, n-1 , C));

     else if(wt[n-1] > C){
        dp[n][C] = Knapsack(wt, val, n-1 ,C);
     }

      return dp[n][C];
}

// top-Down Approach
public int KnapsackHelper(int[] A , int [] B, int C, int n , int [][] dp){
    for( int i =0 ;i<= n  ; i++){
        for(int j =0 ;j<= C ; j++ ){
            if( n ==0 || C == 0){
                dp[i][j] = 0;
            }
             
        }
    }
     for( int i =1; i<= n ; i++){
         for ( int j =1; j<= C ; j++){
             if( B[i-1] <= j){
                 dp[i][j] = Math.max( A[i-1] + dp[i-1][j-B[i - 1]], dp[i-1][j]);
             }
             else {
                 dp[i][j] = dp[i-1][j];
             }
         }
     }
     
        return   dp[n][C];
}
