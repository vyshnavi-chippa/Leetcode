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
        if(head==null||head.next==null)
        return head;
        ListNode temp=head.next;
        ListNode p=head;
        while(head!=null&&head.next!=null){
            ListNode nn=head.next;
            p.next=nn;
            head.next=head.next.next;
            nn.next=head;
            p=head;
            head=head.next;
            //System.out.print(head.val+" ");
        }
        return temp;
    }
}