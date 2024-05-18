/**
 * Problem: Roman to Integer
 * Link:    https://leetcode.com/problems/roman-to-integer/
 * Level:   Easy
 * Topic:   Strings, HashMap
 *
 * Approach: Scan left to right; subtract if current symbol < next symbol.
 * Time:  O(n)
 * Space: O(1)
 */
import java.util.HashMap;

public class RomanToInteger {

    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1); map.put('V',5); map.put('X',10); map.put('L',50);
        map.put('C',100); map.put('D',500); map.put('M',1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int cur = map.get(s.charAt(i));
            int nxt = (i+1 < s.length()) ? map.get(s.charAt(i+1)) : 0;
            result += (cur < nxt) ? -cur : cur;
        }
        return result;
    }

    public static void main(String[] args) {
        RomanToInteger sol = new RomanToInteger();
        System.out.println(sol.romanToInt("III"));    // 3
        System.out.println(sol.romanToInt("MCMXCIV")); // 1994
    }
}
