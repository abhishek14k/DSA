package classes;

import java.util.Arrays;

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

    public static void main(String[] args) {

        System.out.println("Two sum!!");
        int[] nums = {2,7,11,15};
        System.out.println("Input: "+Arrays.toString(nums));
        int target = 17;
        System.out.println("Target: "+target);

        int[] Result = twoSum(nums, target);
        System.out.println("Result: "+Arrays.toString(Result));
    }
}
