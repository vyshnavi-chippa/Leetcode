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
    public ListNode mergeNodes(ListNode head) {
        ListNode head2=new ListNode(-1);
        ListNode temp=head2;
        head=head.next;
        int sum=0;
        while(head!=null){
            if(head.val!=0){
                sum+=head.val;
            }
            else{
                head2.next=new ListNode(sum);
                System.out.print(head2.val);
                head2=head2.next;
                sum=0;
            }
            head=head.next;
        }
        return temp.next;
    }
}