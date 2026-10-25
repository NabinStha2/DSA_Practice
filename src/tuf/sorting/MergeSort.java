package tuf.sorting;

class MergeSort {
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1, 5, 6};
        MergeSort mergeSort = new MergeSort();
        int[] sortedNums = mergeSort.mergeSort(nums);
        for (int num : sortedNums) {
            System.out.print(num + " ");
        }
    }

    public int[] mergeSort(int[] nums) {
        divide(nums, 0, nums.length - 1);
        return nums;
    }

    public void divide(int[] nums, int low, int high) {
        if (low >= high) return;

        int mid = low + (high - low) / 2;
        divide(nums, low, mid);
        divide(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    public void merge(int[] nums, int low, int mid, int high) {
        // initialize the temp array with the nums array size
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int count = 0;

        // sorting the divide array into merging into temp array
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp[count] = nums[left];
                left++;
            } else {
                temp[count] = nums[right];
                right++;
            }
            count++;
        }

        // copied the remaining elements in the left or right of the array
        while (left <= mid) {
            temp[count] = nums[left];
            left++;
            count++;

        }
        while (right <= high) {
            temp[count] = nums[right];
            right++;
            count++;
        }

        // copied back to the original array nums
        if (high + 1 - low >= 0) System.arraycopy(temp, 0, nums, low, high + 1 - low);
    }
}
