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
    public ListNode removeNodes(ListNode head) {
        ListNode temp=new ListNode(-1);
        ListNode h1=temp;
        Stack<Integer> st=new Stack<>();
        while(head!=null){
            while(!st.isEmpty()&&st.peek()<head.val){
                st.pop();
            }
            st.push(head.val);
            head=head.next;
        }
        int a[]=new int[st.size()];
        for(int i=0;i<a.length;i++)
        a[i]=st.pop();
        for(int i=a.length-1;i>=0;i--){
            temp.next=new ListNode(a[i]);
            temp=temp.next;
        }
        return h1.next;
    }
}