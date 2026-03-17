// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//  🟨 LeetCode — longest-substring-without-repeating-characters
//  Difficulty : Medium
//  Language   : java
//  Date       : 2026-03-17
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━        int max = 0;
        int start = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {

                start = Math.max(start, map.get(c) + 1);

            }
            map.put(c, i);
            max = Math.max(max, i - start + 1);

        }

        return max;

    }
}
