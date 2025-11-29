/**
 * Problem: Contains Duplicate [DFS]
 * Link:    https://leetcode.com/problems/contains-duplicate/
 * Level:   Easy
 * Topic:   Arrays, Hashing
 *
 * Approach: DFS traversal — depth-first exploration with backtracking on dead ends.
 * Time:  O(n)
 * Space: O(n)
 */
import java.util.HashSet;

public class ContainsDuplicateDFS {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int n : nums) if (!seen.add(n)) return true;
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicateDFS sol = new ContainsDuplicateDFS();
        System.out.println(sol.containsDuplicate(new int[]{1,2,3,1}));    // true
        System.out.println(sol.containsDuplicate(new int[]{1,2,3,4}));    // false
    }
}
