package arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Q7_NumberOfGoodPairs {
    public static void main(String[] args) {
    int[] nums={1,2,3,1,1,3};
        System.out.println(Improved(nums));
    }

    public static int numIdenticalPairs(int[] nums) {
        int numsLength= nums.length;
        int ans=0;
        for (int i = 0; i < numsLength-1; i++) {
            for (int j = i+1; j < numsLength; j++) {
                if (nums[i]==nums[j]) ans++;
            }
        }
       return ans;
    }

    public static int Improved(int[] nums) {
        int numsLength= nums.length;
        Map<Integer,Integer> map= new HashMap<>();
        int ans=0;
        for (int i = 0; i < numsLength; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
       Set<Map.Entry<Integer, Integer>> entry= map.entrySet();
        for (Map.Entry e:entry){
         int value= (int) e.getValue();
         if(value>1){
             int sum= (value-1)*(value)/2;
             ans=ans+sum;
         }
        }
        return ans;
    }

}
