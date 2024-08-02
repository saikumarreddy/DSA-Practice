/**
 * Problem: Decode String [Opt]
 * Link:    https://leetcode.com/problems/decode-string/
 * Level:   Medium
 * Topic:   Strings, Stack
 *
 * Approach: Optimized approach — improved space/time complexity over the basic solution.
 * Time:  O(n*k)
 * Space: O(n)
 */
import java.util.Stack;

public class DecodeStringOpt {

    public String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<StringBuilder> builders = new Stack<>();
        StringBuilder cur = new StringBuilder();
        int k = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) { k = k*10 + (c-'0'); }
            else if (c=='[') { counts.push(k); k=0; builders.push(cur); cur=new StringBuilder(); }
            else if (c==']') {
                int n=counts.pop(); StringBuilder prev=builders.pop();
                for (int i=0;i<n;i++) prev.append(cur);
                cur=prev;
            } else cur.append(c);
        }
        return cur.toString();
    }

    public static void main(String[] args) {
        DecodeStringOpt sol = new DecodeStringOpt();
        System.out.println(sol.decodeString("3[a]2[bc]"));   // aaabcbc
        System.out.println(sol.decodeString("3[a2[c]]"));    // accaccacc
    }
}
