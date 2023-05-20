//Q: https://www.codingninjas.com/codestudio/problems/longest-subarray-with-sum-k_5713505?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems&leftPanelTab=1

import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubarraywithgivenSum {
    public static int isExistSub(ArrayList<Integer> a, int n, int k) {


        HashMap<Integer, Integer> hm = new HashMap<>();


        int maxlen =0;
        int sum =0;
        int ans =0;
        int i =-1;
        hm.put(sum, i);

        while( i< n-1) {
            i++;
            sum += a.get(i);

            if(!hm.containsKey(sum)){

                hm.put(sum, i);

            }
            if(hm.containsKey(sum-k)){
                int len =  i -  hm.get(sum-k );
                if( len> maxlen ){
                    maxlen = len;
                }

            }


        }
        return maxlen;

    }
}
