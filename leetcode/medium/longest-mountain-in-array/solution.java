// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//  🟨 LeetCode — longest-mountain-in-array
//  Difficulty : Medium
//  Language   : java
//  Date       : 2026-02-21
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                int left = i - 1;
                int right = i + 1;

                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }
                while (right < arr.length-1 && arr[right] > arr[right + 1]) {
                    right++;
                }

        for (int i = 1; i < arr.length - 1; i++) {


                int len =( right - left) + 1;
        int max = 0;
        }
            return 0;
        if (arr.length < 3) {
class Solution {
    public int longestMountain(int[] arr) {
