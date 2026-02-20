// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//  🟨 LeetCode — best-time-to-buy-and-sell-stock
//  Difficulty : Easy
//  Language   : java
//  Date       : 2026-02-20
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━class Solution {
    public int maxProfit(int[] nums) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

}
        for (int num : nums) {

            if (num < minPrice) {
                minPrice = num;
    }
            } else {
                maxProfit = Math.max(maxProfit, num - minPrice);
            }
        }
        return maxProfit;

