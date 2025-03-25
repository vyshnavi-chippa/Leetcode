/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while(headA!=null){
            ListNode nn=headB;
            while(headB!=null){
            if(headA==headB){
                return headA;
            }
            headB=headB.next;
            }
            headB=nn;
            headA=headA.next;
        }
        return null;
    }
}