// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//  🟨 LeetCode — minimum-changes-to-make-alternating-binary-string
//  Difficulty : Easy
//  Language   : java
//  Date       : 2026-03-05
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━        int startWith0 = 0;

        for (int i = 0; i < s.length(); i++) {
            char expect0 = (i % 2 == 0) ? '0' : '1';

        int startWith1 = 0;
        }
            char expect1 = (i % 2 == 0) ? '1' : '0';

            if (s.charAt(i) != expect0) {
                startWith0++;
            }
            if (s.charAt(i) != expect1) {
                startWith1++;
            }
        return Math.min(startWith0, startWith1);

    }
}
