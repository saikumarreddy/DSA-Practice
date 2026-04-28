/**
 * Problem: Group Anagrams
 * Link:    https://leetcode.com/problems/group-anagrams/
 * Level:   Medium
 * Topic:   Strings, Hashing
 *
 * Approach: For each word, sort its characters to produce a canonical key.
 *           Group words by key in a HashMap.
 * Time:  O(n * k log k)  — n words, k = max word length
 * Space: O(n * k)
 */
import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagrams sol = new GroupAnagrams();
        // [["bat"],["nat","tan"],["ate","eat","tea"]]  (order may vary)
        System.out.println(sol.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println(sol.groupAnagrams(new String[]{""}));    // [[""]]
        System.out.println(sol.groupAnagrams(new String[]{"a"}));   // [["a"]]
    }
}
