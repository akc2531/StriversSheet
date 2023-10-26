import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

import sun.management.counter.LongCounter;
public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        Map<Integer,Integer> aa=new HashMap<>();
        int maxL=0;
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            if(sum==(int)k)
            maxL=Math.max(maxL,i+1);
            int rem=sum-(int)k;
            if(aa.containsKey(rem))
            maxL=Math.max(maxL,i-aa.get(rem));
            if(!aa.containsKey(sum))
            aa.put(sum,i);
        }
        return maxL;
    }
}
