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
     ListNode reverse(ListNode head)
     {
         ListNode curr=head;
         ListNode pre=null;
         while(curr!=null)
         {
             ListNode nx=curr.next;
             curr.next=pre;
             pre=curr;
             curr=nx;
         }
         return pre;
     }
    public int getDecimalValue(ListNode head) {
        ListNode rH=reverse(head);
        int total=0;
        int i=0;
        while(rH!=null)
        {
            int x=rH.val;
           total=total+x*(int)Math.pow(2,i);
           i++;
           rH=rH.next;
        }
        return total;
    }
}
