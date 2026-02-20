// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//  🟨 LeetCode — squares-of-a-sorted-array
//  Difficulty : Easy
//  Language   : java
//  Date       : 2026-02-20
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━class Solution {
    public int[] sortedSquares(int[] nums) {

        for (int i=0 ; i<nums.length ;i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);

    }

        return nums;
}
