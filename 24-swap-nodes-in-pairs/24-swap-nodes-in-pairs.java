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
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            helper(temp,temp.next);
            temp=temp.next.next;
        }
        return head;
    }
    private void helper(ListNode head1,ListNode head2){
        if(head2==null){
            return;
        }
        int temp=head1.val;
        head1.val=head2.val;
        head2.val=temp;
    }
}