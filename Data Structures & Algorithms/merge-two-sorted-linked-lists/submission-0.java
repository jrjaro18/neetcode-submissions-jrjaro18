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
        var cur1 = list1;
        var cur2 = list2;
        var head = new ListNode();
        var curr = head;
        while(cur1 != null && cur2 != null) {
            if (cur1.val < cur2.val) {
                curr.next = new ListNode(cur1.val);
                cur1 = cur1.next;
            } else {
                curr.next = new ListNode(cur2.val);
                cur2 = cur2.next;
            }
            curr = curr.next;
        }

        while(cur1 != null) {
            curr.next = new ListNode(cur1.val);
            cur1 = cur1.next;
            curr = curr.next;
        }

        while(cur2 != null) {
            curr.next = new ListNode(cur2.val);
            cur2 = cur2.next;
            curr = curr.next;
        }

        return head.next;
    }
}