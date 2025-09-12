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
        ListNode t2=head;
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
        int idx=a.length-1;
        while(t2!=null){
            if(t2.val==a[idx]){
                temp.next=t2;
                temp=temp.next;
                idx--;
            }
            t2=t2.next;
        }
        return h1.next;
    }
}