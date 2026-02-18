# ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
#  🟨 LeetCode — Minimum Time Visiting All Points
#  Difficulty : Easy
#  Language   : python3
#  Date       : 2026-02-18
# ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n = points.length;

        for (int i = 1; i < n; i++) {

        }

    }
        
        int dx =  Math.abs(points[i][0] - points[i-1][0]);
        int dy =  Math.abs(points[i][1] - points[i-1][1]);
        int res =0;

        res += Math.max(dx,dy);



        return res;
}
