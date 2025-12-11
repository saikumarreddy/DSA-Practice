/**
 * Problem: Spiral Matrix [DFS]
 * Link:    https://leetcode.com/problems/spiral-matrix/
 * Level:   Medium
 * Topic:   Arrays, Simulation
 *
 * Approach: DFS traversal — depth-first exploration with backtracking on dead ends.
 * Time:  O(m*n)
 * Space: O(1)
 */
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixDFS {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int top=0, bottom=matrix.length-1, left=0, right=matrix[0].length-1;
        while (top<=bottom && left<=right) {
            for (int i=left;i<=right;i++) res.add(matrix[top][i]); top++;
            for (int i=top;i<=bottom;i++) res.add(matrix[i][right]); right--;
            if (top<=bottom) { for (int i=right;i>=left;i--) res.add(matrix[bottom][i]); bottom--; }
            if (left<=right) { for (int i=bottom;i>=top;i--) res.add(matrix[i][left]); left++; }
        }
        return res;
    }

    public static void main(String[] args) {
        SpiralMatrixDFS sol = new SpiralMatrixDFS();
        System.out.println(sol.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}})); // [1,2,3,6,9,8,7,4,5]
    }
}
