/**
 * Problem: Reverse Linked List [BruteForce]
 * Link:    https://leetcode.com/problems/reverse-linked-list/
 * Level:   Easy
 * Topic:   Linked Lists
 *
 * Approach: Brute force — nested iteration for clarity; useful as a baseline comparison.
 * Time:  O(n)
 * Space: O(1)
 */

public class ReverseLinkedListBruteForce {

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
        ReverseLinkedListBruteForce sol = new ReverseLinkedListBruteForce();
        ListNode h = new ListNode(1); h.next=new ListNode(2); h.next.next=new ListNode(3);
        ListNode r = sol.reverseList(h);
        while(r!=null){System.out.print(r.val+" ");r=r.next;} System.out.println(); // 3 2 1
    }
}
