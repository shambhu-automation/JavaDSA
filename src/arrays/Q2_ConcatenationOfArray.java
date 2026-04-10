package arrays;

import java.util.Arrays;

public class Q2_ConcatenationOfArray {
    public static void main(String[] args) {
     int[] input={1,3,2,1};
     int[] ans=getConcatenation(input);
        System.out.println(Arrays.toString(ans));
    }


    public static int[] getConcatenation(int[] nums) {
        if(nums==null) return nums;
     int[] ans = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=nums[i];
            ans[i+ nums.length]=nums[i];
        }
        return ans;
    }

    //fastest solution

    public int[] getConcatenationFastest(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        System.arraycopy(nums, 0, ans, 0, n);
        System.arraycopy(nums, 0, ans, n, n);
        return ans;
    }
}
