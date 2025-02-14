/**
 * Problem: Contains Duplicate [DPMemo]
 * Link:    https://leetcode.com/problems/contains-duplicate/
 * Level:   Easy
 * Topic:   Arrays, Hashing
 *
 * Approach: DP memoization — top-down recursion with HashMap cache avoids recomputation.
 * Time:  O(n)
 * Space: O(n)
 */
import java.util.HashSet;

public class ContainsDuplicateDPMemo {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int n : nums) if (!seen.add(n)) return true;
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicateDPMemo sol = new ContainsDuplicateDPMemo();
        System.out.println(sol.containsDuplicate(new int[]{1,2,3,1}));    // true
        System.out.println(sol.containsDuplicate(new int[]{1,2,3,4}));    // false
    }
}
