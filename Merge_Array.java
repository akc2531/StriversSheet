import java.util.*;
import java.util.ArrayList;
public class Solution
  {
      public static List<Integer> sortedArray(int[] a, int[] b) {
        List<Integer> aa=new ArrayList<Integer>();
        for(int i=0;i<a.length;i++)
          aa.add(a[i]);
        for(int i=0;i<b.length;i++)
          aa.add(b[i]);
        Collections.sort(aa);
        for(int i=1;i<aa.size();i++)
          {
            if(aa.get(i-1)>=aa.get(i))
            {
              aa.remove(i);
              i--;
            }
          }
        return aa;
      }
  }
