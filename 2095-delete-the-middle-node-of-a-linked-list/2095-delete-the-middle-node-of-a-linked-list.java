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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        int size=0;
        ListNode h1=new ListNode();
        h1=head;
        while(h1!=null){
            size++;
            h1=h1.next;
        }
        ListNode h2=new ListNode();
        h2=head;
        for(int i=0;i<(size/2-1);i++){
            h2=h2.next;
        }
        h2.next=h2.next.next;
        return head;
    }
}