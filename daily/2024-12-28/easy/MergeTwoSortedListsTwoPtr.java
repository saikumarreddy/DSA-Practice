/**
 * Problem: Merge Two Sorted Lists [TwoPtr]
 * Link:    https://leetcode.com/problems/merge-two-sorted-lists/
 * Level:   Easy
 * Topic:   Linked Lists
 *
 * Approach: Two-pointer variant — reduces auxiliary space by leveraging sorted order.
 * Time:  O(n+m)
 * Space: O(1)
 */

public class MergeTwoSortedListsTwoPtr {

    static class ListNode { int val; ListNode next; ListNode(int v){val=v;} }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0), cur = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) { cur.next=l1; l1=l1.next; }
            else { cur.next=l2; l2=l2.next; }
            cur=cur.next;
        }
        cur.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedListsTwoPtr sol = new MergeTwoSortedListsTwoPtr();
        ListNode l1=new ListNode(1); l1.next=new ListNode(2); l1.next.next=new ListNode(4);
        ListNode l2=new ListNode(1); l2.next=new ListNode(3); l2.next.next=new ListNode(4);
        ListNode r=sol.mergeTwoLists(l1,l2);
        while(r!=null){System.out.print(r.val+" ");r=r.next;} // 1 1 2 3 4 4
    }
}
