// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//  🟨 LeetCode — partitioning-into-minimum-number-of-deci-binary-numbers
//  Difficulty : Medium
//  Language   : java
//  Date       : 2026-03-01
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━class Solution {
    public int minPartitions(String n) {

        int max = 0;


        return max;

        for (char c : n.toCharArray()) {
            max = Math.max(max, c - '0');
        }
    }
}
