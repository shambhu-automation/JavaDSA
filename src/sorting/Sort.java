package sorting;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr={};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
    public static int[] bubbleSort(int[] arr){
        int length= arr.length;
        for (int i = 0; i < length-1; i++) {
            for (int j = 0; j < length-1-i; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr){
        int length= arr.length;
        for (int i = 0; i < length-1; i++) {
         int last= length-1-i;
         int maxElement=maxElementIndex(arr,0,last);
         int temp=arr[last];
         arr[last]=arr[maxElement];
         arr[maxElement]=temp;
        }
    return arr;
    }
     static int maxElementIndex(int[] arr,int start,int last){
        int max= start;
         for (int i = start; i <= last; i++) {
             if (arr[i]>arr[max]) max=i;
         }
         return max;
     }
}
