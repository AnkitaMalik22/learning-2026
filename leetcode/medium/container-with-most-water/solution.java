// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//  🟨 LeetCode — container-with-most-water
//  Difficulty : Medium
//  Language   : java
//  Date       : 2026-03-10
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━class Solution {
    public int maxArea(int[] height) {

        int n = height.length;

        int left = 0;
        int right = n - 1;
        int max = 0;

        while (left < right) {

            int h = Math.min(height[left], height[right]);

            int w = right - left;
            max = Math.max(max, h * w);
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
