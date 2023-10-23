import java.util.*;
public class Solution {
    public static int linearSearch(int n, int num, int []arr){
        // Write your code here.
        int res=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==num)
            {
              res=i;
              break;
            }
            else
            res=-1;
        }
        return res;
    }
}
