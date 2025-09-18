/**
 * Problem: Contains Duplicate [BFS]
 * Link:    https://leetcode.com/problems/contains-duplicate/
 * Level:   Easy
 * Topic:   Arrays, Hashing
 *
 * Approach: BFS traversal — level-by-level exploration guarantees shortest path.
 * Time:  O(n)
 * Space: O(n)
 */
import java.util.HashSet;

public class ContainsDuplicateBFS {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int n : nums) if (!seen.add(n)) return true;
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicateBFS sol = new ContainsDuplicateBFS();
        System.out.println(sol.containsDuplicate(new int[]{1,2,3,1}));    // true
        System.out.println(sol.containsDuplicate(new int[]{1,2,3,4}));    // false
    }
}
