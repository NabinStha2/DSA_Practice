public class ContiguousArray {

    public static void main(String[] args) {
        int result = findMaxLength(new int[]{0, 0, 0, 1, 1, 1, 0});
        int result2 = findMaxLength(new int[]{0, 1, 1, 0, 1, 0, 0});
        int result3 = findMaxLength(new int[]{1, 1, 0, 1, 0, 0, 0, 1});
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }

    public static int findMaxLength(int[] nums) {
        int result1 = 0;
        int result2 = 0;

        for (int num : nums) {
            if (num == 0) {
                result1++;
            }
            if (num == 1) {
                result2++;
            }
        }

        System.out.println("result1 :: " + result1);
        System.out.println("result2 :: " + result2);

        if (result1 == result2) {
            return result1 * 2;
        } else if (result1 > result2) {
            return result2 * 2;
        } else {
            return result1 * 2;
        }

//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) {
//                nums[i] = -1;
//            }
//        }
//
//        System.out.println(Arrays.toString(nums));
//
//        for (int i = 1; i < nums.length; i++) {
//            if ((nums[i] + nums[i - 1] <= 1) && (nums[i] + nums[i - 1] >= 0)) {
//                nums[i] = nums[i] + nums[i - 1];
//            }
//            System.out.println(Arrays.toString(nums));
//        }
//
//        for (int num : nums) {
//            if (num == 0) {
//                result = result + 2;
//            }
//
//        }
    }
}


