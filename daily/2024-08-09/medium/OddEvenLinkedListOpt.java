/**
 * Problem: Odd Even Linked List [Opt]
 * Link:    https://leetcode.com/problems/odd-even-linked-list/
 * Level:   Medium
 * Topic:   Linked Lists
 *
 * Approach: Optimized approach — improved space/time complexity over the basic solution.
 * Time:  O(n)
 * Space: O(1)
 */

public class OddEvenLinkedListOpt {

    static class ListNode { int val; ListNode next; ListNode(int v){val=v;} }
    public ListNode oddEvenList(ListNode head) {
        if (head==null) return null;
        ListNode odd=head, even=head.next, evenHead=even;
        while (even!=null && even.next!=null) {
            odd.next=even.next; odd=odd.next;
            even.next=odd.next; even=even.next;
        }
        odd.next=evenHead;
        return head;
    }

    public static void main(String[] args) {
        OddEvenLinkedListOpt sol = new OddEvenLinkedListOpt();
        ListNode h=new ListNode(1); h.next=new ListNode(2);
        h.next.next=new ListNode(3); h.next.next.next=new ListNode(4);
        h.next.next.next.next=new ListNode(5);
        ListNode r=sol.oddEvenList(h);
        while(r!=null){System.out.print(r.val+" ");r=r.next;} // 1 3 5 2 4
    }
}
