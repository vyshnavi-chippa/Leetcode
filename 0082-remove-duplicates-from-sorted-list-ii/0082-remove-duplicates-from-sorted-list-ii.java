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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode nn=new ListNode(-101);
        ListNode temp=nn;
        while(head!=null){
            boolean flag=false;
            while(head.next!=null&&head.val==head.next.val){
                head=head.next;
                flag=true;
            }
            if(flag) head=head.next;
            if(head==null){ 
                nn.next=null;
                return temp.next;}
            if(head!=null&&head.next!=null&&head.val==head.next.val) continue;
            System.out.print(head.val+" ");
            nn.next=head;
            nn=nn.next;
            head=head.next;
        }
        return temp.next;
    }
}