package arrays;

import java.util.Arrays;

public class Q8_NumbersLessThenCurrentNumber {
    public static void main(String[] args) {
      int[] nums={8,1,2,2,3};
        System.out.println(Arrays.toString(bruteSolution(nums)));
        System.out.println(Arrays.toString(betterSolution(nums)));

    }

    public static int[] bruteSolution(int[] nums){
        int length= nums.length;
        int[] ans =new int[length];
        for (int i = 0; i <length ; i++) {
            int count=0;
            for (int j = 0; j < length; j++) {
                if (j!=i && nums[j]<nums[i]) count++;
            }
            ans[i]=count;
        }
        return ans;
    }
     public static int[] betterSolution(int[] nums){
         int length= nums.length;
         int[] map= new int[101];
         int[] ans =new int[length];
         for (int i = 0; i < length; i++) {
             map[nums[i]]++;
         }
         int sum=0;
         for (int i = 1; i < 101; i++) {
             map[i] += map[i - 1];

         }
         for (int i = 0; i < length; i++) {
            ans[i]=map[nums[i]-1];
         }
         return ans;
     }
}
