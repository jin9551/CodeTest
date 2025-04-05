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
    public ListNode deleteDuplicates(ListNode head) {
    
        ListNode temp = new ListNode();
        ListNode tail = temp;
        
        int a = 101;
        if(head == null) {
            return head;
        } else {
            while(head != null){
                int x =  head.val;
                if(a != x) {
                    a = x;
                    ListNode newNode = new ListNode(x);
                    tail.next = newNode;
                    tail = tail.next;  
                } 

                head = (head !=null) ? head.next : null;
            }
        }

        ListNode result = temp.next;
        temp.next = null;

        return result; 

    }
}