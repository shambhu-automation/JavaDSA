package searching;

public class Q7_SmallestLetterGratterThanTarget {
    public static char nextGreatestLetter(char[] letters, char target) {
       if (target>=letters[letters.length-1]) return letters[0];
        char ans=letters[0];
        int start=0;
        int end=letters.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (letters[mid]==target) {
                if(letters[mid+1]!=target) return letters[mid+1];
                start=mid+1;
            }
            else if(letters[mid]>target){
                ans=letters[mid];
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
       char[] letters = {'c','c','c','c','n','n'};
       char target = 'c';
       char ans=nextGreatestLetter(letters,target);
        System.out.println(ans);
    }
}
