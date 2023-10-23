//Link Ques:--https://www.codingninjas.com/studio/problems/ninja-and-the-zero-s_6581958?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
public class Solution
  {
    public static int[] moveZeros(int n, int []a) {
      int index=0;
      for(int i=0;i<n;i++)
        {
          if(a[i]!=0)
          {
            a[index]=a[i];
            index++;
          }
        }
      for(int i=index;i<n;i++)
        a[i]=0;
      return a;
    }
  }
