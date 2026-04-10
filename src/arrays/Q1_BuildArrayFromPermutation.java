package arrays;

import java.util.Arrays;

public class Q1_BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] input= {0,2,1,5,3,4};
        int[] ans=buildArray(input);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] buildArray(int[] nums) {
        if(nums == null || nums.length == 0) return nums;
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i]=nums[nums[i]];
        }
       return ans;
    }
}
