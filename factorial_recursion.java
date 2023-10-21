import java.util.*;
public class Solution {
    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
        List<Long> a = new ArrayList<Long>();
        long m=0;
        int i=1;
  while(m<=n)
   {
     m=  findFactorial(i);
      if (m <= n)
                a.add(m);
            i++;
   }
   return a;
    }
    
    public static long findFactorial(long n)
    {
       if(n==0)
       return 1;
       return n*findFactorial(n-1);
    }
}
