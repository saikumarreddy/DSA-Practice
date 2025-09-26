/**
 * Problem: Merge Intervals [BFS]
 * Link:    https://leetcode.com/problems/merge-intervals/
 * Level:   Medium
 * Topic:   Arrays, Sorting
 *
 * Approach: BFS traversal — level-by-level exploration guarantees shortest path.
 * Time:  O(n log n)
 * Space: O(n)
 */
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class MergeIntervalsBFS {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();
        for (int[] iv : intervals) {
            if (res.isEmpty() || res.get(res.size()-1)[1] < iv[0]) {
                res.add(iv);
            } else {
                res.get(res.size()-1)[1] = Math.max(res.get(res.size()-1)[1], iv[1]);
            }
        }
        return res.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        MergeIntervalsBFS sol = new MergeIntervalsBFS();
        System.out.println(Arrays.deepToString(sol.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}}))); // [[1,6],[8,10],[15,18]]
    }
}
