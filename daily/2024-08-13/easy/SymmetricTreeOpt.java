/**
 * Problem: Symmetric Tree [Opt]
 * Link:    https://leetcode.com/problems/symmetric-tree/
 * Level:   Easy
 * Topic:   Trees, DFS
 *
 * Approach: Optimized approach — improved space/time complexity over the basic solution.
 * Time:  O(n)
 * Space: O(h)
 */

public class SymmetricTreeOpt {

    static class TreeNode { int val; TreeNode left,right; TreeNode(int v){val=v;} }
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }
    private boolean isMirror(TreeNode l, TreeNode r) {
        if (l==null&&r==null) return true;
        if (l==null||r==null||l.val!=r.val) return false;
        return isMirror(l.left,r.right) && isMirror(l.right,r.left);
    }

    public static void main(String[] args) {
        SymmetricTreeOpt sol = new SymmetricTreeOpt();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2); root.right=new TreeNode(2);
        root.left.left=new TreeNode(3); root.left.right=new TreeNode(4);
        root.right.left=new TreeNode(4); root.right.right=new TreeNode(3);
        System.out.println(sol.isSymmetric(root)); // true
    }
}
