package MedianOfTwoSortedArrays;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * <p>
 * The overall run time complexity should be O(log (m+n)).
 */
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = mergeSortedArray(nums1, nums2);
        int size = mergedArray.length;
        int second = size / 2;
        int first = size % 2 == 0 ? second - 1 : second;
        return (mergedArray[first] + mergedArray[second]) * 1. / 2;
    }

    private int[] mergeSortedArray(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] mergedArray = new int[m + n];
        int i =0;
        int j = 0;
        int index = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                mergedArray[index] = nums1[i];
                i++;
            } else {
                mergedArray[index] = nums2[j];
                j++;
            }
            index++;
        }
        while (i < m) {
            mergedArray[index++] = nums1[i++];
        }
        while (j < n) {
            mergedArray[index++] = nums2[j++];
        }
        return mergedArray;
    }
}