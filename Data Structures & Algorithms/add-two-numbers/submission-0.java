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
        var cur1 = l1;
        var cur2 = l2;

        var sol = new ListNode();
        var head = sol;
        boolean carry = false;
        while(cur1 != null && cur2 != null) {
            var val = carry ? 1 : 0;
            val += cur1.val+cur2.val;
            if (val / 10 != 0) carry = true;
            else carry = false;
            head.next = new ListNode(val%10);
            head = head.next;
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        while(cur1 != null) {
            var val = carry ? 1 : 0;
            val += cur1.val;
            if (val / 10 != 0) carry = true;
            else carry = false;
            head.next = new ListNode(val%10);
            head = head.next;
            cur1 = cur1.next;
        }
        while(cur2 != null) {
            var val = carry ? 1 : 0;
            val += cur2.val;
            if (val / 10 != 0) carry = true;
            else carry = false;
            head.next = new ListNode(val%10);
            head = head.next;
            cur2 = cur2.next;
        }
        if (carry == true) head.next = new ListNode(1);
        return sol.next;
    }

    // 321
    //  91
    // 1->2->3
    // 1->9
}
