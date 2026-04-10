package searching.medium;

public class Q2_SingleElementInASortedArray {
    public static void main(String[] args) {
        int[] nums={1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicateBrute(nums));
    }
    public static int singleNonDuplicateBrute(int[] nums) {
        if (nums.length==1) return nums[0];
        for (int i = 0; i < nums.length-2; i=i+2) {
            if(nums[i]!=nums[i+1]) return nums[i];
        }
        return nums[nums.length-1];
    }
    public static int singleNonDuplicateBinary(int[] nums) {
        if (nums.length==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[nums.length-1]!=nums[nums.length-2]) return nums[nums.length-1];
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if((nums[mid]!=nums[mid-1]) && (nums[mid]!=nums[mid+1])) return nums[mid];
            if(nums[mid]==nums[mid-1]){
                if ((end-mid)%2==0) end=mid-2;
                else start=mid+1;
            }
            else {
                if ((end-mid+1)%2==0) end=mid-1;
                else start=mid+2;
            }
        }
        return -1;
    }
}
