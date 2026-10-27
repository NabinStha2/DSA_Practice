package tuf.Arrays;

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