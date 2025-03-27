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
    public ListNode midValue(ListNode head){
        ListNode s=head,f=head;
        while(f.next!=null&&f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    public ListNode reverse(ListNode h){
        ListNode p=null;
        while(h!=null){
            ListNode n=h.next;
            h.next=p;
            p=h;
            h=n;
        }
        return p;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode mid=midValue(head);
        ListNode rev=mid.next;
        mid.next=null;
        ListNode sh=reverse(rev);
        while(head!=null&&sh!=null){
            if(head.val!=sh.val)
            return false;
            else{
                head=head.next;
                sh=sh.next;
            }
        }
        return true;
    }
}