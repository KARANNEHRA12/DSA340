//https://leetcode.com/problems/majority-element/Q:
import java.util.HashMap;
import java.util.Map;

public class MajorityElemenNByTwo {
    public int majorityElement(int[] nums) {
        //--------------- using hashMap---------------
        int n = nums.length;
//        Map<Integer, Integer> ans = new HashMap<>();
//        for( int i=0; i< nums.length; i++){
//            int val = ans.getOrDefault(nums[i], 0);
//            ans.put(nums[i] , val+1);
//
//        }
//        for( Map.Entry<Integer,Integer> mp : ans.entrySet()){
//            if( mp.getValue() > (n/2)){
//                return mp.getKey();
//            }
//        }
//         return -1;

        // -----------using Moore Voting Algorithms------------------
//        int n = nums.length;
        int elem = 0;
        int count = 0;
//         for storing elem
        for (int i = 0; i < n ; i++) {
            if( count  == 0){
                count =1;
                elem = nums[i];
            }
            else if(elem == nums[i]){
                count++;
            }
            else {
                count--;
            }


        }
        // for checking if elem is the majority eleme or not
        int count1 =0;
        for( int i =0; i< n; i++){
            if( nums[i] == elem){
                count1++;
            }
        }
        if( count1 > (n/2))
            return elem;
        else
            return -1;


    }
}
