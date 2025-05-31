/**
 * Problem: Kth Smallest Element in a BST [Recursive]
 * Link:    https://leetcode.com/problems/kth-smallest-element-in-a-bst/
 * Level:   Medium
 * Topic:   Trees, DFS
 *
 * Approach: Recursive decomposition — divide into subproblems and combine results.
 * Time:  O(n)
 * Space: O(h)
 */
import java.util.Stack;

public class KthSmallestBSTRecursive {

    static class TreeNode { int val; TreeNode left,right; TreeNode(int v){val=v;} }
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        while (true) {
            while (root!=null) { stack.push(root); root=root.left; }
            root=stack.pop();
            if (--k==0) return root.val;
            root=root.right;
        }
    }

    public static void main(String[] args) {
        KthSmallestBSTRecursive sol = new KthSmallestBSTRecursive();
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(1); root.right=new TreeNode(4);
        root.left.right=new TreeNode(2);
        System.out.println(sol.kthSmallest(root,1)); // 1
        System.out.println(sol.kthSmallest(root,2)); // 2
    }
}
