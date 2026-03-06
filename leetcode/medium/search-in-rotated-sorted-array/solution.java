// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//  🟨 LeetCode — search-in-rotated-sorted-array
//  Difficulty : Medium
//  Language   : java
//  Date       : 2026-03-06
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━class Solution {
    public int search(int[] nums, int target) {

        int start = 0, end = nums.length - 1;
        int n = nums.length;

        int mid = -1;

        if (n == 0)
            return -1;
        if (n == 1)
            return nums[0] == target ? 0 : -1;

        int pivot = findPivot(nums);

        if (nums[pivot] == target) {
            return pivot;
        }

        if (pivot > 0 && target >= nums[start] && target <= nums[pivot - 1]) {
