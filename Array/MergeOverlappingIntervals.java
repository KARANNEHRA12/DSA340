//Q: https://leetcode.com/problems/merge-intervals/description/
import java.util.ArrayList;
import java.util.Arrays;

public class MergeOverlappingIntervals {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        for (int[] interval : intervals ) {
            if(list.size() == 0){
                list.add(interval);
            }
            else {
                int [] prevInterval = list.get(list.size()-1);
                if(interval[0] <= prevInterval[1]){
                    prevInterval[1] = Math.max(interval[1], prevInterval[1]);
                    }
                else {
                    list.add(interval);
                }
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
