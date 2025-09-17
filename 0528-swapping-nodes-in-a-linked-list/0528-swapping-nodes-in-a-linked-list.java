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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        ListNode c1=null;
        ListNode c2=null;
        int s=size(head);
        if(k==s-k+1)
        return head;
        int c=1;
        while(head!=null){
            if(k==c){
                c1=head;
            }
            if(k==s-c+1){
                c2=head;
            }
            c++;head=head.next;
        }
        int t=c1.val;
        c1.val=c2.val;
        c2.val=t;

        return temp;
    }
    public int size(ListNode head){
        int c=0;
        while(head!=null){
            c++;
            head=head.next;
        }
        return c;
    }
}