//Q: https://leetcode.com/problems/powx-n/

public class PowerXN {
    public double myPow(double x, int n) {
        long xn =  n;
        double ans  = 1.0;
         if( xn < 0 ) xn = -1 * xn;
        while( xn > 0){
             if ( xn % 2 ==0 ){
                 x = x * x;
                 xn = xn /2;
             }
             else {
                  ans = ans * x;
                  xn = xn-1;
             }
        }
        if( n < 0 )
            ans = (double) (1.0) / ( double)  (ans );
         return  ans;


    }
}
