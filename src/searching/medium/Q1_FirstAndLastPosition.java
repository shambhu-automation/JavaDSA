package searching.medium;

import java.util.Arrays;

public class Q1_FirstAndLastPosition {
    public static int[] searchRange(int[] nums, int target) {
      if (nums.length==0) return new int[]{-1,-1};
      int indexOfNumberSmallerThanTarget= searchInsertStart(nums,target);
      int indexOfNumberGreaterThanTarget = searchInsertEnd(nums, target);
        if ((indexOfNumberGreaterThanTarget-indexOfNumberSmallerThanTarget)==1) return new int[]{-1,-1};
      else return new int[]{indexOfNumberSmallerThanTarget+1,indexOfNumberGreaterThanTarget-1};

    }

    public static int searchInsertEnd(int[] nums, int target) {
        int start=0;
        int end= nums.length-1;
        while (start<=end){
            int mid= start+(end-start)/2;
            if (nums[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return start;
    }

    public static int searchInsertStart(int[] nums, int target) {
        int start=0;
        int end= nums.length-1;
        while (start<=end){
            int mid= start+(end-start)/2;
            if (nums[mid]>=target) end=mid-1;
            else start=mid+1;
        }
        return end;
    }

    public static void main(String[] args) {
        int[] nums ={5,7,7,8,8,10};
        int target=6;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }

}
