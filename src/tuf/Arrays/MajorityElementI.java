package tuf.Arrays;

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