/**
 * Problem: Valid Anagram [Stack]
 * Link:    https://leetcode.com/problems/valid-anagram/
 * Level:   Easy
 * Topic:   Strings, Hashing
 *
 * Approach: Stack-based simulation — replaces call stack with explicit stack structure.
 * Time:  O(n)
 * Space: O(1)
 */

public class ValidAnagramStack {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c-'a']++;
        for (char c : t.toCharArray()) count[c-'a']--;
        for (int n : count) if (n != 0) return false;
        return true;
    }

    public static void main(String[] args) {
        ValidAnagramStack sol = new ValidAnagramStack();
        System.out.println(sol.isAnagram("anagram", "nagaram")); // true
        System.out.println(sol.isAnagram("rat", "car"));          // false
    }
}
