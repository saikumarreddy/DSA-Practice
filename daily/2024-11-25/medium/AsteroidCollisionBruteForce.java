/**
 * Problem: Asteroid Collision [BruteForce]
 * Link:    https://leetcode.com/problems/asteroid-collision/
 * Level:   Medium
 * Topic:   Stack
 *
 * Approach: Brute force — nested iteration for clarity; useful as a baseline comparison.
 * Time:  O(n)
 * Space: O(n)
 */
import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollisionBruteForce {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int a : asteroids) {
            boolean alive = true;
            while (alive && a<0 && !stack.isEmpty() && stack.peek()>0) {
                if (stack.peek() < -a) { stack.pop(); }
                else if (stack.peek() == -a) { stack.pop(); alive=false; }
                else { alive=false; }
            }
            if (alive) stack.push(a);
        }
        return stack.stream().mapToInt(x->x).toArray();
    }

    public static void main(String[] args) {
        AsteroidCollisionBruteForce sol = new AsteroidCollisionBruteForce();
        System.out.println(Arrays.toString(sol.asteroidCollision(new int[]{5,10,-5}))); // [5, 10]
        System.out.println(Arrays.toString(sol.asteroidCollision(new int[]{8,-8})));    // []
        System.out.println(Arrays.toString(sol.asteroidCollision(new int[]{10,2,-5}))); // [10]
    }
}
