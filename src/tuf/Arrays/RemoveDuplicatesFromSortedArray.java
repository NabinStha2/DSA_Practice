package tuf.Arrays;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 */

/* Algorithm:
 * 1. Initialize a pointer j to 0, which will keep track of the position of the last unique element found.
 * 2. Iterate through the array using a pointer i starting from index 1.
 * 3. For each element nums[i], compare it with nums[j].
 *    - If they are different, increment j and update nums[j] to nums[i].
 *    - If they are the same, continue to the next iteration.
 * 4. After the loop, return j + 1 as the new length of the array without duplicates.
 */
class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        int length = removeDuplicates(nums);
        System.out.println("Length of array after removing duplicates: " + length);
        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }


    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 0;
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

//    public int removeDuplicates(int[] nums) {
//        if (nums.length == 0) return 0;
//        int j = 0;
//        for(int i = j + 1; i < nums.length; i++){
//            if(nums[j] != nums[i]){
//                int temp = nums[i];
//                nums[i] = nums[j+1];
//                nums[j+1] = temp;
//                j++;
//            }
//        }
//
//        return j+1;
//    }
}