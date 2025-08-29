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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head=list1;
        ListNode temp=list1;
        int c=0;
        while(c!=b){
            temp=temp.next;
            c++;
            System.out.print(c+" "+b+" ");
        }
        c=0;
        while(c!=a-1){
            list1=list1.next;
            c++;
        }
        list1.next=list2;
        while(list2.next!=null){
            list2=list2.next;
        }
        list2.next=temp.next;
        return head;

    }
}