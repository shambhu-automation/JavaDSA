package arrays;

import java.util.ArrayList;
import java.util.List;

public class Q6_KidsWithGratestNumberOfCandle {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        List<Boolean> result= kidsWithCandies(candies,extraCandies);
        System.out.println(result);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        int maxValue=findMaxValueFromArray(candies);
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]+extraCandies>maxValue) result.set(i,true);
            else result.set(i,false);
        }
       return result;
    }
    public static int findMaxValueFromArray(int[] candies){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < candies.length ; i++) {
            if (candies[i]>max) max=candies[i];
        }
        return  max;
    }
}
