package MinimumPenalty;

/**
 * You are given the customer visit log of a shop represented by a 0-indexed string customers consisting only of characters 'N' and 'Y':
 * <p>
 * if the ith character is 'Y', it means that customers come at the ith hour
 * whereas 'N' indicates that no customers come at the ith hour.
 * If the shop closes at the jth hour (0 <= j <= n), the penalty is calculated as follows:
 * <p>
 * For every hour when the shop is open and no customers come, the penalty increases by 1.
 * For every hour when the shop is closed and customers come, the penalty increases by 1.
 * Return the earliest hour at which the shop must be closed to incur a minimum penalty.
 */
public class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int[] maxBenefit = new int[n + 1];

        int countY = 0;
        int countN = 0;

        for (int i = 0; i < n; i++) {
            maxBenefit[i] = Math.max(countY - countN, 0);
            if (customers.charAt(i) == 'Y') {
                countY++;
            } else {
                countN++;
            }
        }
        maxBenefit[n] = Math.max(countY - countN, 0);

        int ans = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= n; i++) {
            if (maxBenefit[i] > max) {
                max = maxBenefit[i];
                ans = i;
            }
        }
        return ans;
    }
}
