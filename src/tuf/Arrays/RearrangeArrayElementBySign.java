package tuf.Arrays;

class RearrangeArrayElementBySign {
    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] rearrangedArray = rearrangeArray(nums);
        System.out.print("Rearranged array: ");
        for (int num : rearrangedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] rearrangeArray(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size];
        int posInd = 0;
        int negInd = 1;
        for (int i = 0; i < size; i++) {
            if (nums[i] > 0) {
                ans[posInd] = nums[i];
                posInd = posInd + 2;
            } else {
                ans[negInd] = nums[i];
                negInd = negInd + 2;
            }
        }

        return ans;
    }
}