/**
 * Problem: Find All Anagrams in a String [Opt]
 * Link:    https://leetcode.com/problems/find-all-anagrams-in-a-string/
 * Level:   Medium
 * Topic:   Strings, Sliding Window
 *
 * Approach: Optimized approach — improved space/time complexity over the basic solution.
 * Time:  O(n)
 * Space: O(1)
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsOpt {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length()) return res;
        int[] pc = new int[26], sc = new int[26];
        for (char c : p.toCharArray()) pc[c-'a']++;
        for (int i = 0; i < p.length(); i++) sc[s.charAt(i)-'a']++;
        if (Arrays.equals(pc,sc)) res.add(0);
        for (int i = p.length(); i < s.length(); i++) {
            sc[s.charAt(i)-'a']++;
            sc[s.charAt(i-p.length())-'a']--;
            if (Arrays.equals(pc,sc)) res.add(i-p.length()+1);
        }
        return res;
    }

    public static void main(String[] args) {
        FindAllAnagramsOpt sol = new FindAllAnagramsOpt();
        System.out.println(sol.findAnagrams("cbaebabacd","abc")); // [0, 6]
        System.out.println(sol.findAnagrams("abab","ab"));        // [0, 1, 2]
    }
}
