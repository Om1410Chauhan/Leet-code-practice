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
    public boolean isPalindrome(ListNode head) {
        ListNode head1=head;
        ArrayList<Integer> list=new ArrayList();
        while(head1!=null){
            list.add(head1.val);
            head1=head1.next;
        }
        int i=0;
        int j=list.size()-1;
        while(i<=j){
            if(list.get(i)!=list.get(j)){
                return false;
            }
            i++;j--;
        }
        return true;
        
    }
}