/**
 * Problem: Linked List Cycle [Recursive]
 * Link:    https://leetcode.com/problems/linked-list-cycle/
 * Level:   Easy
 * Topic:   Linked Lists, Two Pointers
 *
 * Approach: Recursive decomposition — divide into subproblems and combine results.
 * Time:  O(n)
 * Space: O(1)
 */

public class LinkedListCycleDetectRecursive {

    static class ListNode { int val; ListNode next; ListNode(int v){val=v;} }
    public boolean hasCycle(ListNode head) {
        ListNode slow=head, fast=head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next; fast=fast.next.next;
            if (slow==fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedListCycleDetectRecursive sol = new LinkedListCycleDetectRecursive();
        ListNode h=new ListNode(3); h.next=new ListNode(2);
        h.next.next=new ListNode(0); h.next.next.next=new ListNode(-4);
        h.next.next.next.next=h.next; // cycle
        System.out.println(sol.hasCycle(h)); // true
    }
}
