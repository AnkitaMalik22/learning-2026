// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//  🟨 LeetCode — minimum-size-subarray-sum
//  Difficulty : Medium
//  Language   : java
//  Date       : 2026-02-21
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
       for(int right=0; right<n ;right++){
        sum += nums[right];

        while(sum >= target){
        
            sum -= nums[left];
            min = Math.min(min ,right-left+1);
            left++;
          }

       }

       return min == Integer.MAX_VALUE ? 0 : min;
        
    }
}
