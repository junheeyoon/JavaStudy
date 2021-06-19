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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode result = new ListNode();
        ListNode copynode = result;
        int sum = 0;
        int val = 0;
        while(l1 != null || l2 != null){
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            
            val = sum % 10;
            sum = sum / 10;
            ListNode answer = new ListNode(val);
            copynode.next = answer;
            copynode = copynode.next;
        }
        if(sum > 0){
            ListNode answer = new ListNode(sum);
            copynode.next = answer;
            //copynode = copynode.next;
        }
        return result.next;
    }
}
