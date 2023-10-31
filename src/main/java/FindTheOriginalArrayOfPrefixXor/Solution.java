package FindTheOriginalArrayOfPrefixXor;

/**
 * You are given an integer array pref of size n. Find and return the array arr of size n that satisfies:
 * <p>
 * pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i].
 * Note that ^ denotes the bitwise-xor operation.
 * <p>
 * It can be proven that the answer is unique.
 */
class Solution {
    public int[] findArray(int[] pref) {
        int[] result = new int[pref.length];
        result[0] = pref[0];

        for (int i = 1; i < pref.length; i++) {
            result[i] = pref[i] ^ pref[i - 1];
        }

        return result;
    }
}