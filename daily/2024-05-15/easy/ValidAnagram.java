/**
 * Problem: Valid Anagram
 * Link:    https://leetcode.com/problems/valid-anagram/
 * Level:   Easy
 * Topic:   Strings, Hashing
 *
 * Approach: Count char frequencies with a 26-element array; compare counts.
 * Time:  O(n)
 * Space: O(1)
 */

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c-'a']++;
        for (char c : t.toCharArray()) count[c-'a']--;
        for (int n : count) if (n != 0) return false;
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram sol = new ValidAnagram();
        System.out.println(sol.isAnagram("anagram", "nagaram")); // true
        System.out.println(sol.isAnagram("rat", "car"));          // false
    }
}
