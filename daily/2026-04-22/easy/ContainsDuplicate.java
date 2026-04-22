/**
 * Problem: Contains Duplicate
 * Link:    https://leetcode.com/problems/contains-duplicate/
 * Level:   Easy
 * Topic:   Arrays, Hashing
 *
 * Approach: Add each element to a HashSet; return true on first collision.
 * Time:  O(n)
 * Space: O(n)
 */
import java.util.HashSet;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int n : nums) if (!seen.add(n)) return true;
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate sol = new ContainsDuplicate();
        System.out.println(sol.containsDuplicate(new int[]{1,2,3,1}));    // true
        System.out.println(sol.containsDuplicate(new int[]{1,2,3,4}));    // false
    }
}
