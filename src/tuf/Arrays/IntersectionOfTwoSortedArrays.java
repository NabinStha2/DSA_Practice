package tuf.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given two sorted arrays, find the intersection of the two arrays.
 * The intersection of two arrays is a list that contains all the elements that are present in both arrays.
 * The result should also be sorted in ascending order.
 */

/*
 * Approach:
 * 1. Use two pointers to traverse both arrays.
 * 2. If the elements at both pointers are equal, add the element to the result list and move both pointers forward.
 * 3. If the element in the first array is smaller, move the pointer in the first array forward.
 * 4. If the element in the second array is smaller, move the pointer in the second array forward.
 * 5. Continue this process until one of the pointers reaches the end of its respective array.
 * 6. Convert the result list to an array and return it.
 */
class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] intersection = intersectionArray(nums1, nums2);
        System.out.println(Arrays.toString(intersection));
    }

    public static int[] intersectionArray(int[] nums1, int[] nums2) {
        List<Integer> inter = new ArrayList<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0;
        int j = 0;

        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                if (nums1[i] == nums2[j]) {
                    inter.add(nums1[i]);
                    j++;
                }
                i++;
            } else {
                j++;
            }
        }

        return inter
                .stream()
                .mapToInt(e -> e)
                .toArray();
    }
}