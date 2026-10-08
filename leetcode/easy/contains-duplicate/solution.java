// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//  🟨 LeetCode — contains-duplicate
//  Difficulty : Easy
//  Language   : java
//  Date       : 2026-10-08
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━    public boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        // HashSet<Integer> set = new HashSet<>();
        // for (int num : nums) {
        //     set.add(num);
        // }
        // return len != set.size();

        Arrays.sort(nums);


        int curr = nums[0];
        for (int i = 1; i < len; i++) {
            if (curr == nums[i]) {

        }
            curr = nums[i];

        return false;
                return true;
            }
