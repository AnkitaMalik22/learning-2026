// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//  🟨 LeetCode — find-minimum-in-rotated-sorted-array
//  Difficulty : Medium
//  Language   : java
//  Date       : 2026-03-02
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[start] < nums[end]) {
                min = Math.min(min, nums[start]);
                break;
            }

            if (nums[mid] >= nums[start]) {

                start = mid + 1;
            } else {
                end = mid - 1;
            }
            min = Math.min(min, nums[mid]);

        }

        return min;

    }
