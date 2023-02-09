package classes;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    //O(n2) Time complexity
    public static int[] twoSum(int[] nums, int target) {

        for (int i=0; i < nums.length; i++) {
            for (int j=i+1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    //O(n) Time complexity
    public static int[] twoSumOn(int[] nums, int target) {
        int n = nums.length;
        int[] res = new int[2];

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i=0; i<n; i++) {
            int temp = target - nums[i];
            if(hm.containsKey(temp)) {
                res[0] = hm.get(temp);
                res[1] = i;
                return res;
            }
            hm.put(nums[i], i);
        }
        return res;
    }


    public static void main(String[] args) {

        System.out.println("Two sum!!");
        int[] nums = {2,7,11,15};
        System.out.println("Input: "+Arrays.toString(nums));
        int target = 18;
        System.out.println("Target: "+target);

        int[] Result1 = twoSum(nums, target);
        System.out.println("Result: "+Arrays.toString(Result1));

        target = 17;
        int[] Result2 = twoSumOn(nums, target);
        System.out.println("Result: "+Arrays.toString(Result2));
    }
}
