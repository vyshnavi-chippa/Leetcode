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
    public int pairSum(ListNode head) {
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;}
        int a[]=new int[size];
        int idx=0;
        while(head!=null){
            a[idx]=head.val;
            head=head.next;
            idx++;
        }
        int max=0;
        for(int i=0;i<size/2;i++){
            max=Math.max(max,a[i]+a[size-i-1]);
        }
        return max;
    }
}