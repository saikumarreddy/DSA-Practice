/**
 * Problem: Target Sum [Iterative]
 * Link:    https://leetcode.com/problems/target-sum/
 * Level:   Medium
 * Topic:   DP, Backtracking
 *
 * Approach: Iterative implementation — equivalent logic using explicit stack/loop.
 * Time:  O(n*sum)
 * Space: O(sum)
 */
import java.util.HashMap;

public class TargetSumWaysIterative {

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
        TargetSumWaysIterative sol = new TargetSumWaysIterative();
        System.out.println(sol.findTargetSumWaysIterative(new int[]{1,1,1,1,1},3)); // 5
        System.out.println(sol.findTargetSumWaysIterative(new int[]{1},1));          // 1
    }
}
