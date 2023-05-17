import java.util.ArrayList;
import java.util.HashMap;

//Q: https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1
public class longesArrayWithZeroSum {
    public static int isExistSub(ArrayList<Integer> a, int n) {


        HashMap<Integer, Integer>  hm = new HashMap<>();
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
            else{
                int len =  i -  hm.get(sum);
                if( len> maxlen ){
                    maxlen = len;
                }

            }


        }
        return maxlen;

    }

    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

        // Write your code here.
        return isExistSub(arr, arr.size());

    }
}
