// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//  🟨 LeetCode — reverse-linked-list
//  Difficulty : Easy
//  Language   : java
//  Date       : 2026-02-28
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode newNode = curr.next;
            curr.next = prev;
            prev = curr;

    public ListNode reverseList(ListNode head) {
            curr = newNode;
        }

        return prev;

    }
}
class Solution {
