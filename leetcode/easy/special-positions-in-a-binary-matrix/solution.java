// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//  🟨 LeetCode — special-positions-in-a-binary-matrix
//  Difficulty : Easy
//  Language   : java
//  Date       : 2026-03-04
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━        }

        int count = 0;

            }
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1 && row[i] == 1 && col[j] == 1) {
                    count++;
                }

            }
        }

        return count;
    }
}
