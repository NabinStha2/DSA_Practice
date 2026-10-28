package tuf.Arrays;

class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = {0, 1, 3};
        System.out.println(missingNumber(nums));
    }

    // TC O(n)
    public static int missingNumber(int[] nums) {
        int size = nums.length;
        int totalSum = (size * (size + 1)) / 2;
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return totalSum - sum;
    }

    // TC O(n^2)
//    public int missingNumber(int[] nums) {
//        int missingNum = 0;
//        int size = nums.length;
//        int  j = size;
//
//        while(j > 0){
//            for(int i = 0; i < size; i++){
//                if(nums[i] == missingNum){
//                    missingNum++;
//                    break;
//                }
//            }
//            j--;
//        }
//
//        return missingNum;
//    }
}