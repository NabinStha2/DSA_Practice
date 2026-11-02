package tuf.Arrays;

/**
 * Find the majority element in an array, which is the element that appears
 * more than n/2 times.
 */

/*
 * The majority element is the element that appears more than n/2 times in the array.
 * This implementation uses the Boyer-Moore Voting Algorithm to find the majority element
 * in linear time and constant space.
 */

/* Algorithm:
1. Initialize a variable `element` to store the potential majority element and a counter `count` to keep track of the number of times the current candidate has been seen.
2. Iterate through the array:
   - If `count` is 0, set `element` to the current number and increment `count`.
   - If the current number is equal to `element`, increment `count`.
   - If the current number is different from `element`, decrement `count`.
3. After the first pass, `element` will hold the potential majority element.
4. To confirm that `element` is indeed the majority element, iterate through the array again and count the occurrences of `element`.
5. If the count of `element` is greater than n/2, return `element`. Otherwise, return -1 to indicate that there is no majority element.
*/
class MajorityElementI {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        MajorityElementI majorityElementI = new MajorityElementI();
        int majorityElement = majorityElementI.majorityElement(nums);
        System.out.println("Majority element: " + majorityElement);
    }

    public int majorityElement(int[] nums) {
        int size = nums.length;
        int element = 0;
        int count = 0;

        for (int n : nums) {
            if (count == 0) {
                element = n;
                count++;
            } else if (element == n) {
                count++;
            } else {
                count--;
            }
        }

        int count1 = 0;
        for (int n : nums) {
            if (n == element) {
                count1++;
            }
        }

        if (count1 > (size / 2)) {
            return element;
        }

        return -1;
    }

    // TC O(n log n) + O(n)
//    public int majorityElement(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        int size = nums.length;
//
//        // O(n log n)
//        for(int n : nums){
//            map.put(n, map.getOrDefault(n,0) + 1);
//        }
//
//        // O(n)
//        for(Map.Entry<Integer,Integer> e : map.entrySet()){
//            if(e.getValue() > (size / 2)){
//                return e.getKey();
//            }
//        }
//
//        return -1;
//    }
}