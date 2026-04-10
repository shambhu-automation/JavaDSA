package searching;

public class Q6_ArrengingCoin {
    public static void main(String[] args) {
      int n=8;
        System.out.println(arrangeCoinsBetterSolution(n));
    }
    public static int arrangeCoins(int n) {
    int row=0;
    while (row<n){
        row++;
        n=n-row;
    }
    return row;
    }

    public static int arrangeCoinsBetterSolution(int n) {
      long start=1;
      long end=n;
      long ans=1;
      while (start<=end){
          long mid=start+(end-start)/2;
          long sumcoin=mid*(mid+1)/2;
          if(sumcoin==n) return (int)mid;
          if (sumcoin>n) end=mid-1;
          else{
              ans=mid;
              start=mid+1;
          }
      }
      return (int)ans;
    }
}
