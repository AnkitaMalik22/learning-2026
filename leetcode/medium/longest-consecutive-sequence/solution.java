// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//  🟨 LeetCode — longest-consecutive-sequence
//  Difficulty : Medium
//  Language   : java
//  Date       : 2026-03-08
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━        for (int num : set) {
            if (!set.contains(num - 1)) {
                int curr = num;
        int max = 0;

                max = Math.max(max, count);
        }
            }
                int count = 1;
                while (set.contains(curr + 1)) {
                    count++;
                    curr++;


                }
        return max;


    }
}
