// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//  🟨 LeetCode — kth-largest-element-in-an-array
//  Difficulty : Medium
//  Language   : java
//  Date       : 2026-03-20
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.offer(num);
        }


            if (pq.size() > k) {
                pq.poll();
            }
    }

        return pq.peek();
}
