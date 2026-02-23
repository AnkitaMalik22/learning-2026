// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//  🟨 LeetCode — maximum-subarray
//  Difficulty : Medium
//  Language   : java
//  Date       : 2026-02-23
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━class Solution {
    public int maxSubArray(int[] nums) {

        int max = nums[0], curr = nums[0];


        return max;

        for (int i=1 ; i< nums.length ;i++){
            curr = Math.max(num, num + curr);
        }
    }
            max = Math.max(max, curr);
            int num = nums[i];
}
