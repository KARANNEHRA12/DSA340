// Q: https://practice.geeksforgeeks.org/problems/smallest-number-on-left3403/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

import java.util.ArrayList;
import java.util.Stack;

public class NextSmallerLeft {
    public ArrayList<Integer> NextSmallerToLeft(ArrayList<Integer> nums, int size) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < size; i++) {
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
        return ans;

    }

}
