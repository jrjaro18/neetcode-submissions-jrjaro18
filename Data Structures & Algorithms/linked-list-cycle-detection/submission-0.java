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
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        var slowPointer = head;
        var fastPointer = head.next;
        
        while (fastPointer != null) {
            if (slowPointer == fastPointer) return true;
            else {
                slowPointer = slowPointer.next;
                if (fastPointer.next == null) return false;
                else fastPointer = fastPointer.next.next;
            }
        }

        return false;
    }
}
