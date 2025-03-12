/**
 * Problem: Linked List Cycle [DPMemo]
 * Link:    https://leetcode.com/problems/linked-list-cycle/
 * Level:   Easy
 * Topic:   Linked Lists, Two Pointers
 *
 * Approach: DP memoization — top-down recursion with HashMap cache avoids recomputation.
 * Time:  O(n)
 * Space: O(1)
 */

public class LinkedListCycleDetectDPMemo {

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
        LinkedListCycleDetectDPMemo sol = new LinkedListCycleDetectDPMemo();
        ListNode h=new ListNode(3); h.next=new ListNode(2);
        h.next.next=new ListNode(0); h.next.next.next=new ListNode(-4);
        h.next.next.next.next=h.next; // cycle
        System.out.println(sol.hasCycle(h)); // true
    }
}
