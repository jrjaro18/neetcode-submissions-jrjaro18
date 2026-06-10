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
    public ListNode mergeKLists(ListNode[] lists) {
        var preHead = new ListNode();
        for (var list : lists) {
            var head1 = preHead.next;;
            var head2 = list;
            var temp = new ListNode();
            var cur = temp;
            while(head1 != null && head2 != null) {
                if(head1.val > head2.val) {
                    cur.next = new ListNode(head2.val);
                    head2 = head2.next;
                } else {
                    cur.next = new ListNode(head1.val);
                    head1 = head1.next;
                }
                cur = cur.next;
            }

            while(head1 != null) {
                cur.next = new ListNode(head1.val);
                head1 = head1.next;
                cur = cur.next;
            }

            while(head2 != null) {
                cur.next = new ListNode(head2.val);
                head2 = head2.next;
                cur = cur.next;
            }

            preHead.next = temp.next;
        }
        return preHead.next;
    }
}
