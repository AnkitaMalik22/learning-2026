// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//  🟨 LeetCode — merge-intervals
//  Difficulty : Medium
//  Language   : java
//  Date       : 2026-04-07
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━    }
}
            if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
        return result.toArray(new int[result.size()][]);
                result.add(interval);
            } else {
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], interval[1]);
            }
        }



        ArrayList<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {

