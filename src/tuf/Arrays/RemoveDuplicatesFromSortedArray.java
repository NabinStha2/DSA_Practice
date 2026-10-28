package tuf.Arrays;

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