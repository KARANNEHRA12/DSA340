// Q: https://practice.geeksforgeeks.org/problems/fab3dbbdce746976ba35c7b9b24afde40eae5a04/1?utm_source=gfg&sutm_medium=article&utm_campaign=bottom_sticky_on_article
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextSmallerRight {
    public ArrayList<Integer> NextSmallerToRight(ArrayList<Integer> nums, int size) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for (int i = size - 1; i >= 0; i--) {
            if (s.empty())
                ans.add(-1);
            else if (s.size() > 0 && s.peek() < nums.get(i)) {
                ans.add(nums.get(i));
            } else if (s.size() > 0 && s.peek() >= nums.get(i)) {
                while (s.size() > 0 && s.peek() >= nums.get(i)) {
                    s.pop();

                }
                if (s.size() == 0) {
                    ans.add(-1);

                } else
                    ans.add(nums.get(i));

            }
            s.push(nums.get(i));
        }
        Collections.reverse(ans);
        return ans;

    }

}
