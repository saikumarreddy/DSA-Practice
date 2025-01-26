/**
 * Problem: Target Sum [TwoPtr]
 * Link:    https://leetcode.com/problems/target-sum/
 * Level:   Medium
 * Topic:   DP, Backtracking
 *
 * Approach: Two-pointer variant — reduces auxiliary space by leveraging sorted order.
 * Time:  O(n*sum)
 * Space: O(sum)
 */
import java.util.HashMap;

public class TargetSumWaysTwoPtr {

    public int findTargetSumWays(int[] nums, int target) {
        HashMap<Integer,Integer> dp=new HashMap<>();
        dp.put(0,1);
        for(int n:nums) {
            HashMap<Integer,Integer> next=new HashMap<>();
            for(var e:dp.entrySet()) {
                next.merge(e.getKey()+n, e.getValue(), Integer::sum);
                next.merge(e.getKey()-n, e.getValue(), Integer::sum);
            }
            dp=next;
        }
        return dp.getOrDefault(target,0);
    }

    public static void main(String[] args) {
        TargetSumWaysTwoPtr sol = new TargetSumWaysTwoPtr();
        System.out.println(sol.findTargetSumWaysTwoPtr(new int[]{1,1,1,1,1},3)); // 5
        System.out.println(sol.findTargetSumWaysTwoPtr(new int[]{1},1));          // 1
    }
}
