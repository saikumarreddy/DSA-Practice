/**
 * Problem: Valid Anagram [Recursive]
 * Link:    https://leetcode.com/problems/valid-anagram/
 * Level:   Easy
 * Topic:   Strings, Hashing
 *
 * Approach: Recursive decomposition — divide into subproblems and combine results.
 * Time:  O(n)
 * Space: O(1)
 */

public class ValidAnagramRecursive {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c-'a']++;
        for (char c : t.toCharArray()) count[c-'a']--;
        for (int n : count) if (n != 0) return false;
        return true;
    }

    public static void main(String[] args) {
        ValidAnagramRecursive sol = new ValidAnagramRecursive();
        System.out.println(sol.isAnagram("anagram", "nagaram")); // true
        System.out.println(sol.isAnagram("rat", "car"));          // false
    }
}
