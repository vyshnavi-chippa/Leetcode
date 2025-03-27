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
    public int size(ListNode head){
        int c=0;
        while(head!=null){
            c++;
            head=head.next;
        }
        return c;
    }
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null)
        return head;
        ListNode d1=new ListNode(-1);
        ListNode d2=new ListNode(-1);
        ListNode temp=d1,td1=d1;
        ListNode td=head.next;
        int n=size(head);
        for(int i=0;i<n;i++){
            if(i%2==0){
                d1.next=head;
                td1=d1;
                d1=d1.next;
            }
            else{
                d2.next=head;
                d2=d2.next;
            }
            head=head.next;
        }
        d2.next=null;
        d1.next=td;
        return temp.next;
    }
}