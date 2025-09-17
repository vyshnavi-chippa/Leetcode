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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int a[]=new int[2];
        int mn1=100000,mx1=0,mx2=100000,c=2;
        int min=100000;
        ListNode p=head;
        head=head.next;
        while(head.next!=null){
            if(p.val>head.val&&head.val<head.next.val){
                if(mx1==0)
                mx1=c;
                mn1=mx2;
                mx2=c;
                min=Math.min(min,Math.abs(mx2-mn1));
                System.out.println(mx1+" "+mx2+" "+mn1+" "+min);
            }
            else if(p.val<head.val&&head.val>head.next.val){
                if(mx1==0)
                mx1=c;
                mn1=mx2;
                mx2=c;
                min=Math.min(min,Math.abs(mx2-mn1));
                System.out.println(mx1+" "+mx2+" "+mn1);
            }
            c++;
            p=head;
            head=head.next;
        }
        if(mx1==mx2||mn1==100000){
            a[0]=-1;a[1]=-1;
            return a;
        }
        
        a[0]=min;
        a[1]=mx2-mx1;
        return a;
    }
}