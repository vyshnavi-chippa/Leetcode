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
        if(head==null||head.next==null)
        return head;
        ListNode s=head;
        ListNode f=head;
        while(f.next!=null&&f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;

    }
    
    public ListNode msll(ListNode h,ListNode sh){
        ListNode d1=new ListNode();
        ListNode td=d1;
        while(h!=null&&sh!=null){
            if(h.val<sh.val){
                d1.next=h;
                h=h.next;
            }
            else{
                d1.next=sh;
                sh=sh.next;
            }
            d1=d1.next;
        }
        while(h!=null){
            d1.next=h;
            h=h.next;
            d1=d1.next;
        }
        while(sh!=null){
            d1.next=sh;
            sh=sh.next;
            d1=d1.next;
        }
        return td.next;

    }
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
        return head;
        ListNode mid=midValue(head);
        ListNode sh=mid.next;
        mid.next=null;
        ListNode m1=sortList(head);
        ListNode m2=sortList(sh);
        return msll(m1,m2);
    }
}