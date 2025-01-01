/**
 * Problem: Add Two Numbers [TwoPtr]
 * Link:    https://leetcode.com/problems/add-two-numbers/
 * Level:   Medium
 * Topic:   Linked Lists, Math
 *
 * Approach: Two-pointer variant — reduces auxiliary space by leveraging sorted order.
 * Time:  O(max(m,n))
 * Space: O(max(m,n))
 */

public class AddTwoNumbersTwoPtr {

    static class ListNode { int val; ListNode next; ListNode(int v){val=v;} }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0), cur=dummy;
        int carry=0;
        while (l1!=null||l2!=null||carry!=0) {
            int sum=carry;
            if(l1!=null){sum+=l1.val;l1=l1.next;}
            if(l2!=null){sum+=l2.val;l2=l2.next;}
            carry=sum/10; cur.next=new ListNode(sum%10); cur=cur.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        AddTwoNumbersTwoPtr sol = new AddTwoNumbersTwoPtr();
        ListNode l1=new ListNode(2); l1.next=new ListNode(4); l1.next.next=new ListNode(3);
        ListNode l2=new ListNode(5); l2.next=new ListNode(6); l2.next.next=new ListNode(4);
        ListNode r=sol.addTwoNumbers(l1,l2);
        while(r!=null){System.out.print(r.val+" ");r=r.next;} // 7 0 8
    }
}
