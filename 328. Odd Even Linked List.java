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
    public ListNode oddEvenList(ListNode temp) {
        ListNode oddH=null,evenH=null,oddT=null,evenT=null;
       // ListNode temp=head;
        int idx=1;
        while(temp!=null)
        {
           if(idx%2==0){
                if(evenH==null)
                {
                    evenH=evenT=temp;
                    temp=temp.next;
                }else{
                    evenT.next=temp;
                    evenT=evenT.next;
                    temp=temp.next;
                }
            }
            else
            {
                if(oddH==null)
                {
                    oddH=oddT=temp;
                    temp=temp.next;
                }else{
                    oddT.next=temp;
                    oddT=oddT.next;
                    temp=temp.next;
                }
            }
            idx++;
        }
        if(oddH==null)
        {
            return evenH;
        }
        if(evenH==null)
        {
            return oddH;
        }
        evenT.next=null;
        oddT.next=evenH;
        return oddH;
    }
}
