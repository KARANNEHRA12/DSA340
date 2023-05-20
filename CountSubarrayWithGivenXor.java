//Q: https://www.interviewbit.com/problems/subarray-with-given-xor/
import java.util.HashMap;

public class CountSubarrayWithGivenXor {
    public int subarrayXor(int[] nums, int k) {
        HashMap<Integer, Integer> hm =  new HashMap<>();
        int count =0;
        hm.put(0,1);
        int Xr=0;
        int x=0;
        for (int i = 0; i < nums.length; i++) {
           Xr = Xr ^ nums[i];
           x = Xr ^ k;
            count += hm.getOrDefault(x,0);

            hm.put(Xr, hm.getOrDefault(Xr,0) +1 );


        }
        return count;


    }
}
