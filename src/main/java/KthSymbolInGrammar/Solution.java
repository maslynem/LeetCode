package KthSymbolInGrammar;

/**
 * We build a table of n rows (1-indexed). We start by writing 0 in the 1st row. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.
 * <p>
 * For example, for n = 3, the 1st row is 0, the 2nd row is 01, and the 3rd row is 0110.
 * Given two integer n and k, return the kth (1-indexed) symbol in the nth row of a table of n rows.
 * 0
 * 01
 * 0110
 * 01101001
 * 0110100110010110
 * 01101001100101101001011001101001
 */
class Solution {
    public int kthGrammar(int n, int k) {
        if (k == 1) return 0;
        if (k == 2) return 1;
        if (k == 3) return 1;
        if (k == 4) return 0;
        int elemAmountPrevN = 1 << (n - 2);
        int halfElemAmountPrevN = elemAmountPrevN / 2;
        if (k > elemAmountPrevN) {
            k -= elemAmountPrevN;
            if (k <= halfElemAmountPrevN) {
                k += halfElemAmountPrevN;
            } else {
                k -= halfElemAmountPrevN;
            }
        }
        return kthGrammar(n - 1, k);
    }
}


