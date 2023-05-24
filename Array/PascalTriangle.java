// this question is from stiver sde sheet 
// Q: https://leetcode.com/problems/pascals-triangle-ii/description/

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<Integer> getRow(int rowIndex) {
        long val =1;
        List<Integer> ans = new ArrayList<>();
        for( int j  = 0 ; j<= rowIndex ; j++){
            ans.add((int)val);
            val  = val * ( rowIndex - j );
            val /= ( j+1);

        }
        return ans;


    }

    public static void main(String[] args) {
        String str1 = new String ("I love coding"); 
    String str2 = "I love coding"; 
    boolean check=(str1=="I love coding");
    System.out.println((str1 == str2) + " " + str1.equals(str2)+" " + check); 
    }

}
