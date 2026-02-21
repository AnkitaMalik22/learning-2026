// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//  🟨 LeetCode — minimum-size-subarray-sum
//  Difficulty : Medium
//  Language   : java
//  Date       : 2026-02-21
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━class Solution {
    public int minSubArrayLen(int target, int[] nums) {

     
        int n = nums.length;

        int min =Integer.MAX_VALUE , sum=0;
       
        int left = 0;

        // for(int i=0; i<n ;i++){
           
        // }

       for(int right=0; right<n ;right++){
        sum += nums[right];

        while(sum >= target){
            min = Math.min(min ,right-left+1);
        
            sum -= nums[left];
