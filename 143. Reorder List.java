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
      ListNode getMid(ListNode head)
      {
          ListNode slow=head;
          ListNode fast=head.next;
          while(fast!=null && fast.next!=null)
          {
              slow=slow.next;
              fast=fast.next.next;
          }
          return slow;
      }
      ListNode reverse(ListNode head)
      {
          ListNode curr=head;
          ListNode pre=null;
          while(curr!=null)
          {
              ListNode next=curr.next;
              curr.next=pre;
              pre=curr;
              curr=next;
          }
          return pre;
      }
    public void reorderList(ListNode head) {
        ListNode mid=getMid(head);
        ListNode left=head;
        ListNode right=reverse(mid.next);
        mid.next=null;
        ListNode nextL,nextR;
        while(left!=null && right!=null)
        {
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
    }
}
