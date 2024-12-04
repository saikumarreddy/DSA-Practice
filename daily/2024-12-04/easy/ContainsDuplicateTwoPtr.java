/**
 * Problem: Contains Duplicate [TwoPtr]
 * Link:    https://leetcode.com/problems/contains-duplicate/
 * Level:   Easy
 * Topic:   Arrays, Hashing
 *
 * Approach: Two-pointer variant — reduces auxiliary space by leveraging sorted order.
 * Time:  O(n)
 * Space: O(n)
 */
import java.util.HashSet;

public class ContainsDuplicateTwoPtr {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int n : nums) if (!seen.add(n)) return true;
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicateTwoPtr sol = new ContainsDuplicateTwoPtr();
        System.out.println(sol.containsDuplicate(new int[]{1,2,3,1}));    // true
        System.out.println(sol.containsDuplicate(new int[]{1,2,3,4}));    // false
    }
}
