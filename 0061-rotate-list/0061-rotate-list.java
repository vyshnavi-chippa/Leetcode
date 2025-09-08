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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||k==0)
        return head;
        ListNode temp=head;
        int c=0;
        ListNode p=head;
        while(head!=null){
            c++;
            p=head;
            head=head.next;
        }
        k=k%c;
        if(k==0) return temp;
        ListNode t2=temp;
        int d=c-k;
        while(d!=1){
            temp=temp.next;
            d--;
        }
        ListNode nn=temp.next;
        temp.next=null;
        p.next=t2;
        return nn;
    }
}