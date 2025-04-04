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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 시작 포인터를 유지하기 위한 노드
        ListNode node = new ListNode();
        // 시작포인터를 current에 복사해서 이걸로 작업
        ListNode current = node;

        // 리스트 노드 둘 중에 하나가 끝날때까지
        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                current.next = list2;
                list2 = list2.next;
            } else {
                current.next = list1;
                list1 = list1.next;
            }
            current = current.next;
        }

        // 먼저 끝난 리스트노드를 판단해서 끝나지 않은 리스트 노드로 연결
        current.next= (list1 != null) ? list1 : list2;

        return node.next;
    }
    
}