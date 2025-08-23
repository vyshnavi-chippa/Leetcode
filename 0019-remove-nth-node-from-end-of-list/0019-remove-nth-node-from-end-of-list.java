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
        ListNode th=head;
        int sz=size(head);
        System.out.print(sz);
        int pos=sz-n;
        if(pos==0)
        return head.next;
        while(pos--!=1){
            head=head.next;
        }
        head.next=head.next.next;
        return th;
    }
    public int size(ListNode head){
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
}