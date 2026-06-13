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
    public ListNode reverseList(ListNode head) {
      if(head == null){
        return head;
      }
      ListNode temp = head; 
      ListNode dummy = head;
      Stack<Integer> st = new Stack<>();
      while(temp != null){
        st.push(temp.val);
        temp = temp.next;

      }
     
      while(st.size() != 0){
        
        dummy.next = new ListNode(st.pop());
        dummy = dummy.next;
        


      }
      return head.next;

    }
}