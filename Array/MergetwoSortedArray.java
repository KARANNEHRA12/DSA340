//https://www.codingninjas.com/codestudio/problems/merge-two-sorted-arrays-without-extra-space_6898839?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems
import java.util.Arrays;

public class MergetwoSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int l = m-1;
     int r =0;
        while ( l >= 0 && r < n){
            if( nums1[l] > nums2[r]){
                int temp = nums1[l];
                nums1[l] = nums2[r];
                nums2[r] = temp;
                l--; r++;
            }
             else {
                 break;
            }
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
    }
}
