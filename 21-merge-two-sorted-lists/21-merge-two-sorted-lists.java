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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1=list1;
        ListNode head2=list2;
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return  head1;
        }
        ListNode head,tail;
        /*
        if(head1.val==head2.val){
            head=head1;
            tail=head1;
            head1=head1.next;
        }
        */
        if(head1.val<head2.val){
            head=head1;
            tail=head1;
            head1=head1.next;
        }else{
            head=head2;
            tail=head2;
            head2=head2.next;
        }
        while(head1!=null && head2!=null){
             if(head1.val<head2.val){
                tail.next=head1;
                tail=head1;
                head1=head1.next;
            }else if(head1.val==head2.val){
              tail.next=head1;
               tail=head1;
                 head1=head1.next;   
             }else if(head1.val>head2.val) {
                tail.next=head2;
                tail=head2;
                head2=head2.next;
            }
        }
           if(head1==null){
            tail.next=head2;
        }
        if(head2==null){
            tail.next=head1;
        }
        return head;
    }
}