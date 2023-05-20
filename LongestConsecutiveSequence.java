//Q: https://leetcode.com/problems/longest-consecutive-sequence/
 import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums ){
            hs.add(num);
        }
        int longSeq = 0;
        for( int num : nums ){
            if( !hs.contains(num -1)){
                int currnum = num;
                 int currlongseq = 1;
                 while( hs.contains(currnum + 1)){
                     currlongseq++;
                     currnum++;
                 }
                 longSeq = Math.max(longSeq, currlongseq);

            }

        }
         return longSeq;

    }
}
