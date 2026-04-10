package arrays;

import java.util.Arrays;

public class Q3_RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] inputArray={1,2,3,4};
        int[] ans=runningSum(inputArray);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] runningSum(int[] nums) {
      if (nums==null || nums.length==1) return nums;

        for (int i = 1; i < nums.length; i++) {
            nums[i]=nums[i]+nums[i-1];
        }
      return nums;
    }

    public static int[] runningSumJava26(int[] nums) {
        if (nums==null || nums.length<=1) return nums;

       Arrays.parallelPrefix(nums,(a,b)->a+b);
        return nums;
    }


}
