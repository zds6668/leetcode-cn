package editor.cn;

public class P651_4KeysKeyboard {
    public static void main(String[] args) {
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxA(int N) {
           int[] dp = new int[N+1];
           dp[0] = 0;
            for (int i = 1; i <= N; i++) {
                dp[i] = dp[i-1] + 1;
                for (int j = 2; j < i; j++) {
                    dp[i] = Math.max(dp[i], dp[j-2] * (i-j+1));
                }
            }
            return dp[N];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
