/**
 * Problem: Valid Anagram [Opt]
 * Link:    https://leetcode.com/problems/valid-anagram/
 * Level:   Easy
 * Topic:   Strings, Hashing
 *
 * Approach: Optimized approach — improved space/time complexity over the basic solution.
 * Time:  O(n)
 * Space: O(1)
 */

public class ValidAnagramOpt {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c-'a']++;
        for (char c : t.toCharArray()) count[c-'a']--;
        for (int n : count) if (n != 0) return false;
        return true;
    }

    public static void main(String[] args) {
        ValidAnagramOpt sol = new ValidAnagramOpt();
        System.out.println(sol.isAnagram("anagram", "nagaram")); // true
        System.out.println(sol.isAnagram("rat", "car"));          // false
    }
}
