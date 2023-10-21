public class Solution {
    public static long sumFirstN(long n) {
        // Write your code here.
       return  sum(n,1,0);
    }
     public static long sum(long n,long i,long sum) {
        // Write your code here.
        if(i<=n)
        {
            sum+=i;
          return  sum(n,i+1,sum);
        }
        return sum;
    }
}
