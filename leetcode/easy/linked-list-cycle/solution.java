// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//  🟨 LeetCode — linked-list-cycle
//  Difficulty : Easy
//  Language   : java
//  Date       : 2026-03-03
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;

    }
}
