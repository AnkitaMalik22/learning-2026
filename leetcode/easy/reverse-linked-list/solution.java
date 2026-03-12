// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//  🟨 LeetCode — reverse-linked-list
//  Difficulty : Easy
//  Language   : java
//  Date       : 2026-03-12
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode curr = head;

        ListNode prev = null;

        while (curr != null) {
            curr.next = prev;
        }
    }
            prev = curr;

            curr = newNode;

        return prev;
            ListNode newNode =curr.next;
}
