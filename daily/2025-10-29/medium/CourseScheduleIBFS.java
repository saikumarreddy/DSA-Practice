/**
 * Problem: Course Schedule [BFS]
 * Link:    https://leetcode.com/problems/course-schedule/
 * Level:   Medium
 * Topic:   Graphs, Topological Sort
 *
 * Approach: BFS traversal — level-by-level exploration guarantees shortest path.
 * Time:  O(V+E)
 * Space: O(V+E)
 */
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleIBFS {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] inDegree = new int[numCourses];
        for (int i=0;i<numCourses;i++) adj.add(new ArrayList<>());
        for (int[] p:prerequisites) { adj.get(p[1]).add(p[0]); inDegree[p[0]]++; }
        Queue<Integer> q = new ArrayDeque<>();
        for (int i=0;i<numCourses;i++) if(inDegree[i]==0) q.offer(i);
        int done=0;
        while(!q.isEmpty()) {
            int c=q.poll(); done++;
            for (int nb:adj.get(c)) if(--inDegree[nb]==0) q.offer(nb);
        }
        return done==numCourses;
    }

    public static void main(String[] args) {
        CourseScheduleIBFS sol = new CourseScheduleIBFS();
        System.out.println(sol.canFinish(2,new int[][]{{1,0}}));         // true
        System.out.println(sol.canFinish(2,new int[][]{{1,0},{0,1}}));   // false
    }
}
