package SortIntegersByTheNumberOfFirstBits;

import java.util.*;

/**
 * You are given an integer array arr. Sort the integers in the array in ascending order by the number of 1's in their binary representation and in case of two or more integers have the same number of 1's you have to sort them in ascending order.
 * <p>
 * Return the array after sorting it.
 */
class Solution {
    public int[] sortByBits(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.comparingInt(Integer::bitCount).thenComparing(Integer::compareTo))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}