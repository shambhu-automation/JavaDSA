package searching;

import java.util.Arrays;

public class Q4_TwoSum {
    public static void main(String[] args) {
    int[] numbers = {2,7,11,15};
    int target = 9;
    int[] ans = twoSum(numbers,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] bruteForce(int[] numbers,int target){
        if (numbers.length==2) return new int[]{1,2};
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]+numbers[j]==target) return new int[] {i+1,j+1};
            }
        }
        return  new int[] {-1,-1};
    }

    public static int[] twoSum(int[] numbers, int target) {
      if (numbers.length==2) return new int[]{1,2};

      int first=0;
      int second=numbers.length-1;
      while (first<second){
          int sum=numbers[first]+numbers[second];
            System.out.println("first: "+first+" ,second: "+second+" ,sum: "+sum);
            if (sum==target) return new int[]{first+1,second+1};
          else if(sum<target) first++;
          else second--;
        }

        return new int[]{-1,-1};
    }
}
