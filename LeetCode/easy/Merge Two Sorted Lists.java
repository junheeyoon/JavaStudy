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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);        
        ListNode result = l3;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        while(l1 != null && l2 != null){    
            
            if(l1.val > l2.val){
                result.next = l2;
                l2 = l2.next;
            }
            else{
                result.next = l1;
                l1 = l1.next;
            }
            result = result.next;
        }
        if(l1 == null){
            result.next = l2;
        }
        if(l2 == null){
            result.next = l1;
        }
        return l3.next;
    }
}
