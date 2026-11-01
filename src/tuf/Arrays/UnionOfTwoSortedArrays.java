package tuf.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {3, 4, 5, 6, 7};
        int[] union = unionArray(nums1, nums2);
        System.out.println(Arrays.toString(union));
    }

    public static int[] unionArray(int[] nums1, int[] nums2) {
        List<Integer> union = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                if (union.isEmpty() || union.getLast() != nums1[i]) {
                    union.add(nums1[i]);
                }
                i++;
            } else {
                if (union.isEmpty() || union.getLast() != nums2[j]) {
                    union.add(nums2[j]);
                }
                j++;
            }
        }

        while (i < nums1.length) {
            if (union.isEmpty() || union.getLast() != nums1[i]) {
                union.add(nums1[i]);
            }
            i++;
        }
        while (j < nums2.length) {
            if (union.isEmpty() || union.getLast() != nums2[j]) {
                union.add(nums2[j]);
            }
            j++;
        }

        return union
                .stream()
                .mapToInt(e -> e)
                .toArray();
    }

//    public int[] unionArray(int[] nums1, int[] nums2) {
//        Set<Integer> set = new HashSet<>();
//
//        for (int j : nums1) {
//            set.add(j);
//        }
//        for (int j : nums2) {
//            set.add(j);
//        }
//
//        int[] union = new int[set.size()];
//        union = set.stream().mapToInt(s -> s).toArray();
//        System.out.println(Arrays.toString(union));
//
//        Arrays.sort(union);
//        return union;
//    }
}