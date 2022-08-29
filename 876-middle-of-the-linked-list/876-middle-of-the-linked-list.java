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
    public ListNode middleNode(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode temp=head;
        ListNode slow=head,fast=head;
        while(temp!=null){
         if(fast.next!=null && fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
          }
            temp=temp.next;
        }
        if(fast.next==null){
            return slow;
        }
         
        return slow.next;
    }
}