/**
 * Problem: Isomorphic Strings [DFS]
 * Link:    https://leetcode.com/problems/isomorphic-strings/
 * Level:   Easy
 * Topic:   Strings, HashMap
 *
 * Approach: DFS traversal — depth-first exploration with backtracking on dead ends.
 * Time:  O(n)
 * Space: O(1)
 */
import java.util.HashMap;

public class IsomorphicStringsDFS {

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> st = new HashMap<>(), ts = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sc=s.charAt(i), tc=t.charAt(i);
            if ((st.containsKey(sc) && st.get(sc)!=tc) ||
                (ts.containsKey(tc) && ts.get(tc)!=sc)) return false;
            st.put(sc,tc); ts.put(tc,sc);
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicStringsDFS sol = new IsomorphicStringsDFS();
        System.out.println(sol.isIsomorphic("egg","add"));  // true
        System.out.println(sol.isIsomorphic("foo","bar"));  // false
    }
}
