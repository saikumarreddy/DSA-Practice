/**
 * Problem: Longest Substring Without Repeating Characters
 * Link:    https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Level:   Medium
 * Topic:   Strings, Sliding Window, Hashing
 *
 * Approach: Sliding window — expand right pointer, shrink left when a duplicate
 *           is found. Track the last seen index of each character in a HashMap.
 * Time:  O(n)
 * Space: O(min(n, 26)) — bounded by charset size
 */
import java.util.HashMap;

public class LongestSubstringWithoutRepeating {

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> lastSeen = new HashMap<>();
        int max = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (lastSeen.containsKey(c) && lastSeen.get(c) >= left) {
                left = lastSeen.get(c) + 1;
            }
            lastSeen.put(c, right);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeating sol = new LongestSubstringWithoutRepeating();
        System.out.println(sol.lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(sol.lengthOfLongestSubstring("bbbbb"));    // 1
        System.out.println(sol.lengthOfLongestSubstring("pwwkew"));   // 3
        System.out.println(sol.lengthOfLongestSubstring(""));         // 0
    }
}
