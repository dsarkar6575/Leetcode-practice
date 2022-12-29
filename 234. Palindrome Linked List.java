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
    static ListNode getMid(ListNode head)
     {
         ListNode slow=head;
         ListNode fast=head;
         while(fast!=null && fast.next!=null)
         {
             slow=slow.next;
             fast=fast.next.next;
         }
         return slow;
     }
    public boolean isPalindrome(ListNode head) {
      if(head==null || head.next==null)
      {
          return true;
      }
      ListNode curr=getMid(head);
      ListNode pre=null;
      ListNode next;
      while(curr!=null)
      {
          next=curr.next;
          curr.next=pre;
          pre=curr;
          curr=next;
      }

      ListNode left=head;
      ListNode right=pre;

      while(right!=null)
      {
          if(left.val!=right.val)
          {
              return false;
          }
          left=left.next;
          right=right.next;
      }
      return true;
        
    }
}
