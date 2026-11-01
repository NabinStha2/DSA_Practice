package tuf.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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