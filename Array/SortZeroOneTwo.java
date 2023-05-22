//Q:https://leetcode.com/problems/sort-colors/description/
public class SortZeroOneTwo {
    public void swap( int[]a , int i,int j)
    {
        int temp= a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public void sortColors(int[] nums) {
        int i=0;
        int j=0;
        int k=nums.length-1;
        while (j <=k)
        {
            if( nums[j] == 1){
                j++;
            }
            else if( nums[j] == 0){
                swap( nums ,i,j);
                i++;
                j++;

            }
            else{
                swap( nums ,j,k);
                k--;
            }
        }


    }
}
