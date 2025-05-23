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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        while(head.next!=null){
            int a=head.val;
            int b=head.next.val;
            int k=gcd(a,b);
            ListNode l1=new ListNode(k);
            l1.next=head.next;
            head.next=l1;
            head=head.next.next;
        }
        return temp;
    }
    int gcd(int a,int b){
        if(b==0)
        return a;
        return gcd(b,a%b);
    }
}