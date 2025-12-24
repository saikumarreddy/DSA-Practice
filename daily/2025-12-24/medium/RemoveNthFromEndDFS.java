/**
 * Problem: Remove Nth Node From End of List [DFS]
 * Link:    https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * Level:   Medium
 * Topic:   Linked Lists, Two Pointers
 *
 * Approach: DFS traversal — depth-first exploration with backtracking on dead ends.
 * Time:  O(n)
 * Space: O(1)
 */

public class RemoveNthFromEndDFS {

    static class ListNode { int val; ListNode next; ListNode(int v){val=v;} }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0); dummy.next=head;
        ListNode fast=dummy, slow=dummy;
        for (int i=0;i<=n;i++) fast=fast.next;
        while (fast!=null) { fast=fast.next; slow=slow.next; }
        slow.next=slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        RemoveNthFromEndDFS sol = new RemoveNthFromEndDFS();
        ListNode h=new ListNode(1); h.next=new ListNode(2); h.next.next=new ListNode(3);
        h.next.next.next=new ListNode(4); h.next.next.next.next=new ListNode(5);
        ListNode r=sol.removeNthFromEnd(h,2);
        while(r!=null){System.out.print(r.val+" ");r=r.next;} // 1 2 3 5
    }
}
