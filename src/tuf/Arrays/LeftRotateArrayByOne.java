package tuf.Arrays;

/**
 * Left rotate an array by one position.
 */

/* Algorithm to left rotate an array by one position:
1. Store the first element of the array in a temporary variable.
2. Shift all elements of the array one position to the left.
3. Place the temporary variable (the original first element) at the end of the array.
Time Complexity: O(n), where n is the number of elements in the array.
Space Complexity: O(1), as we are using a constant amount of extra space.
*/
class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1, 5, 6};
        LeftRotateArrayByOne leftRotateArrayByOne = new LeftRotateArrayByOne();
        leftRotateArrayByOne.rotateArrayByOne(nums);
        System.out.print("Array after left rotation by one: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public void rotateArrayByOne(int[] nums) {
        if (nums.length <= 1) return;
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = temp;
    }

//    public void rotateArrayByOne(int[] nums) {
//        for(int i = 0; i < nums.length - 1; i++){
//            int temp = nums[i];
//            nums[i] = nums[i+1];
//            nums[i+1] = temp;
//        }
//    }
}