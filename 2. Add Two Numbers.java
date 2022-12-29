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
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode l3=dummy;
        int car=0;
        while(l1!=null || l2!=null)
        {
            int fl=(l1!=null)?l1.val:0;
            int sl=(l2!=null)?l2.val:0;

            int sum=fl+sl+car;
            car=sum/10;
            int ld=sum%10;
            ListNode newNode=new ListNode(ld);
            l3.next=newNode;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
            l3=l3.next;
        }
        if(car>0)
        {
            ListNode newNode=new ListNode(car);
            l3.next=newNode;
        }
        return dummy.next;
    }
}
