package FindInMountainArray;

/**
 * You may recall that an array arr is a mountain array if and only if:
 * <p>
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.
 * <p>
 * You cannot access the mountain array directly. You may only access the array using a MountainArray interface:
 * <p>
 * MountainArray.get(k) returns the element of the array at index k (0-indexed).
 * MountainArray.length() returns the length of the array.
 * Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.
 */
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peekIndex = findPeek(mountainArr);
        int leftSideIndex = binarySearch(0, peekIndex, target, mountainArr);
        int rightSideIndex = binarySearchDes(peekIndex, mountainArr.length() - 1, target, mountainArr);
        return leftSideIndex != -1 ? leftSideIndex : rightSideIndex;
    }

    private int binarySearchDes(int left, int right, int target, MountainArray mountainArray) {
        while (left <= right) {
            int mod = (left + right) / 2;
            int cur = mountainArray.get(mod);
            if (cur == target) {
                return mod;
            } else if (cur < target) {
                right = mod - 1;
            } else {
                left = mod + 1;
            }
        }
        return -1;
    }

    private int binarySearch(int left, int right, int target, MountainArray mountainArray) {
        while (left <= right) {
            int mod = (left + right) / 2;
            int cur = mountainArray.get(mod);
            if (cur == target) {
                return mod;
            } else if (cur < target) {
                left = mod + 1;
            } else {
                right = mod - 1;
            }
        }
        return -1;
    }

    private int findPeek(MountainArray arr) {
        int left = 0;
        int right = arr.length() - 1;
        while (left <= right) {
            int mod = (left + right) / 2;
            int cur = arr.get(mod);
            int prev = arr.get(mod - 1);
            int next = arr.get(mod + 1);

            if (prev < cur && cur > next) {
                return mod;
            } else if (prev < cur && cur < next) {
                left = mod;
            } else {
                right = mod;
            }
        }
        return left;
    }

}


// This is MountainArray's API interface.
// You should not implement it, or speculate about its implementation
interface MountainArray {
    int get(int index);

    int length();
}