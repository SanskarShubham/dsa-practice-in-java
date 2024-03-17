package oops;

import java.util.HashMap;

public class Two_sum22 {

    public int[] twoSum(int[] nums, int target) {
      
        HashMap<Integer,Integer> NumMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            NumMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (NumMap.containsKey(complement) && NumMap.get(complement) != i ) {
                 return new int[]{i,NumMap.get(complement)};
            }
        }
        return new int[]{}; // No solution found
    }
}
    

