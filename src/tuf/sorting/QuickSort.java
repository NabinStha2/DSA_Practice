package tuf.sorting;

class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1, 5, 6};
        QuickSort quickSort = new QuickSort();
        int[] sortedNums = quickSort.quickSort(nums);
        for (int num : sortedNums) {
            System.out.print(num + " ");
        }
    }
    
    public int[] quickSort(int[] nums) {
        qs(nums, 0, nums.length - 1);
        return nums;
    }

    public void qs(int[] nums, int low, int high) {
        if (low < high) {
            int partitionIndex = findingPartitionIndex(nums, low, high);
            qs(nums, low, partitionIndex - 1);
            qs(nums, partitionIndex + 1, high);
        }
    }

    public int findingPartitionIndex(int[] nums, int low, int high) {
        int pivot = nums[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (i < high && nums[i] <= pivot) {
                i++;
            }
            while (j > low && nums[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(nums, i, j);
            }
        }
        swap(nums, low, j);
        return j;
    }

    public void swap(int[] nums, int i, int j) {
        int temp;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}