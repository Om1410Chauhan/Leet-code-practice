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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
           count++;
            temp=temp.next;
        }   
        temp=head;
        int i=count-n;
        if(count==1){
            return null;
        }
        if(i==0){
            head=head.next;
            return head;
        }
            for(int j=0;j<i-1;j++){
                temp=temp.next;
            }
        temp.next=temp.next.next;
        return head;
    }
}