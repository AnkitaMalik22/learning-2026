// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//  🟨 LeetCode — product-of-array-except-self
//  Difficulty : Medium
//  Language   : java
//  Date       : 2026-03-24
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━                res[i] = product / nums[i];
            } else if (zeros >= 2) {
                res[i] = 0;

            } else {
                //==1


            i++;
                if (nums[i] == 0) {
                    res[i] = product;
                } else {
                    res[i] = 0;
                }
            }
        return res;
        }

    }
}
