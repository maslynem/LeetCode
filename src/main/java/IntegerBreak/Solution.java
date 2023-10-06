package IntegerBreak;

/**
 * Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers.
 * <p>
 * Return the maximum product you can get.
 */
class Solution {
//    public int integerBreak(int n) {
//        int max = 1;
//        for (int i = 2; i < n; i++) {
//            int tempMax = 1;
//            int tempN = n;
//            while (tempN - i > 0) {
//                tempMax *= i;
//                tempN -= i;
//                max = Math.max(max, tempMax * tempN);
//            }
//            tempMax *= tempN;
//            max = Math.max(max, tempMax);
//        }
//        return max;
//    }

    /**
     *  Bottom-Up Dynamic Solution
     */
        public int integerBreak(int n) {
            if (n <= 3) {
                return n - 1;
            }
            int[] dp = new int[n+1];
            for (int i = 1; i <= 3; i++) {
                dp[i] = i;
            }
            for (int i = 4; i <= n; i++) {
                int ans = i;
                for (int j = 2; j < ans; j++) {
                    ans = Math.max(ans, j * dp[i-1]);
                }
                dp[i] = ans;
            }
            return dp[n];
        }
}
