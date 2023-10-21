import java.util.*;
public class solution
  {
      static int lcm(int a,int b)
    {
      int lcm1=Math.max(a,b);
      while(true)
        {
          if(lcm1%a==0&&lcm1%b==0)
            return lcm1;
          lcm1+=Math.max(a,b);
        }
    }
  }
