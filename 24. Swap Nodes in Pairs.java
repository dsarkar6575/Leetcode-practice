/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode dumy=new ListNode();
        dumy.next=head;
        ListNode curr=head;
        ListNode pre=dumy;

        while(curr!=null && curr.next!=null)
        {
            ListNode nex=curr.next;
            curr.next=nex.next;
            nex.next=pre.next;
            pre.next=nex;

            pre=curr;
            curr=curr.next;
        }
        return dumy.next;
    }
}
