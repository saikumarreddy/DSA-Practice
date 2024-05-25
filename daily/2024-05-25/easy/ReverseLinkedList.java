/**
 * Problem: Reverse Linked List
 * Link:    https://leetcode.com/problems/reverse-linked-list/
 * Level:   Easy
 * Topic:   Linked Lists
 *
 * Approach: Iterative — prev/curr pointers; redirect next, advance both.
 * Time:  O(n)
 * Space: O(1)
 */

public class ReverseLinkedList {

    static class ListNode { int val; ListNode next; ListNode(int v){val=v;} }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ReverseLinkedList sol = new ReverseLinkedList();
        ListNode h = new ListNode(1); h.next=new ListNode(2); h.next.next=new ListNode(3);
        ListNode r = sol.reverseList(h);
        while(r!=null){System.out.print(r.val+" ");r=r.next;} System.out.println(); // 3 2 1
    }
}
