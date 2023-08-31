package MinimumNumberOfTapsToOpenToWaterAGarden;

/**
 * There is a one-dimensional garden on the x-axis.
 * The garden starts at the point 0 and ends at the point n. (i.e The length of the garden is n).
 * <p>
 * There are n + 1 taps located at points [0, 1, ..., n] in the garden.
 * <p>
 * Given an integer n and an integer array ranges of length n + 1 where ranges[i] (0-indexed) means the i-th tap can water the area [i - ranges[i], i + ranges[i]] if it was open.
 * <p>
 * Return the minimum number of taps that should be open to water the whole garden, If the garden cannot be watered return -1.
 */
class Solution {
    public int minTaps(int n, int[] ranges) {
        int[] startToEnd = new int[n + 1];
        for (int i = 0; i <= n; i++) {

            int start = Math.max(0, i - ranges[i]);
            int end = Math.min(n, i + ranges[i]);

            if (start == 0 && end == n)
                return 1;

            startToEnd[start] = Math.max(startToEnd[start], end);
        }
        int currentEnd = startToEnd[0];
        int count = 0;
        int nextEnd = currentEnd;
        int index = 0;

        while (index <= currentEnd) {

            nextEnd = Math.max(nextEnd, startToEnd[index]);

            if (index == currentEnd) {
                currentEnd = nextEnd;
                count++;
            }
            index++;
        }

        return currentEnd == n ? count : -1;
    }
}

