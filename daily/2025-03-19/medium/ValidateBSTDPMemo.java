/**
 * Problem: Validate Binary Search Tree [DPMemo]
 * Link:    https://leetcode.com/problems/validate-binary-search-tree/
 * Level:   Medium
 * Topic:   Trees, DFS
 *
 * Approach: DP memoization — top-down recursion with HashMap cache avoids recomputation.
 * Time:  O(n)
 * Space: O(h)
 */

public class ValidateBSTDPMemo {

    static class TreeNode { int val; TreeNode left,right; TreeNode(int v){val=v;} }
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean validate(TreeNode node, long min, long max) {
        if (node==null) return true;
        if (node.val<=min||node.val>=max) return false;
        return validate(node.left,min,node.val) && validate(node.right,node.val,max);
    }

    public static void main(String[] args) {
        ValidateBSTDPMemo sol = new ValidateBSTDPMemo();
        TreeNode root=new TreeNode(2);
        root.left=new TreeNode(1); root.right=new TreeNode(3);
        System.out.println(sol.isValidBST(root)); // true
    }
}
