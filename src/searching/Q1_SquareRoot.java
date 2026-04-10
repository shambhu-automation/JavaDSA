package searching;

public class Q1_SquareRoot {
    public static void main(String[] args) {
     int x=4;
        System.out.println(linearResult(2147395600));
        System.out.println(binaryResult(2147395600));

    }
    public  static int linearResult(int x){
        int ans=-1;
        for (int i = 0; i < x; i++) {
            if((long)i*i<=x) ans=i;
            else break;
        }
        return ans;
    }

    public static int binaryResult(int x){
        if(x==0 || x==1) return x;
        long start=1;
        long end=x-1;
        long ans=-1;
        while (start<=end){
            long mid=start+(end-start)/2;
            if(mid==x/mid) return(int) mid;
            if(mid>x/mid) end=mid-1;
            else {
                ans=mid;
                start=mid+1;
            }
        }
       return (int) ans;

    }
}
