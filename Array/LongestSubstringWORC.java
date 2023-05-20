//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWORC {
//    using Hashset
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> hs = new HashSet<>();

        if( s.length() == 0 )
            return 0;
        int l =0 ;

        int len =0;

        for( int r =0 ; r < s.length(); r++){

            if(hs.contains(s.charAt(r))){
                while (l < r && hs.contains(s.charAt(r))) {
                    hs.remove(s.charAt(l));
                    l++;
                }

            }

            hs.add(s.charAt(r));
            len = Math.max(len, r - l + 1);
        }
        return len;

    }
    // using hashMap
    public int lengthOfLongestSubstring (String s,int k) {
        HashMap< Character, Integer > mpp = new HashMap < Character, Integer > ();

        int left = 0, right = 0;
        int n = s.length();
        int len = 0;
        while (right < n) {
            if (mpp.containsKey(s.charAt(right)))
                left = Math.max(mpp.get(s.charAt(right)) + 1, left);

            mpp.put(s.charAt(right), right);

            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }

}
