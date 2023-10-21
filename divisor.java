public class Solution {
    public static int sumOfAllDivisors(int n){
        // Write your code here.
        int sumi=0,res=0;
        for(int i=1;i<=n;i++)
        {
            sumi=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                sumi+=j;
            }
            res+=sumi;
        }
        return res;
    }
}
