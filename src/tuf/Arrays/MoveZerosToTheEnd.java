package tuf.Arrays;


/**
 * Move all the zeros to the end of the array while maintaining the relative order of the non-zero elements.
 * <p>
 * Example:
 * Input: [0, 1, 0, 3, 12]
 * Output: [1, 3, 12, 0, 0]
 */

/*
 * Approach:
 * 1. Use two pointers, i and j.
 * 2. Initialize j to -1, which will track the position of the first zero found in the array.
 * 3. Iterate through the array with pointer i.
 * 4. When a zero is found at index i, set j to i and break the loop.
 * 5. Continue iterating through the array with pointer i starting from j + 1.
 * 6. When a non-zero element is found at index i, swap it with the element at index j and increment j.
 * 7. Repeat until the end of the array is reached.
 * 8. The result will be an array with all zeros moved to the end while maintaining the order of non-zero elements.
 */
class MoveZerosToTheEnd {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        MoveZerosToTheEnd moveZerosToTheEnd = new MoveZerosToTheEnd();
        moveZerosToTheEnd.moveZeroes(nums);
        System.out.print("Array after moving zeros to the end: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    // TC = O(x) + O(n-x) = O(n)
    public void moveZeroes(int[] nums) {
        int j = -1;

        // O(x)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            return;
        }

        // O(n-x)
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

//    public void moveZeroes(int[] nums) {
//        int j = 0;
//
//        for (int i = j + 1; i < nums.length; i++) {
//            if (nums[j] == 0) {
//                if (nums[i] != 0) {
//                    int temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                    j++;
//                }
//            } else {
//                j = i;
//            }
//        }
//    }
}