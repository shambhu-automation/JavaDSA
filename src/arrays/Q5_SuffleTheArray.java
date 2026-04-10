package arrays;

import java.util.Arrays;

public class Q5_SuffleTheArray {
    public static void main(String[] args) {
     int[] inputArray = {1,2,3,4,4,3,2,1};
     int[] ans= shuffle(inputArray,inputArray.length/2);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] shuffle(int[] nums, int n) {
        if(n<1) return nums;
        int[] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
             ans[i*2]=nums[i];
             ans[i*2+1]=nums[i+n];
        }
       return ans;
    }
}
