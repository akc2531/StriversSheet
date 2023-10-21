public class Solution {
    public static int[] printNos(int x) {
        // Write Your Code Here
         return  res(new int[x],x,0);
    }
       static int[] res(int a[],int x,int i)
    {
        if(i<x)
        {
            a[i]=i+1;
            return res(a,x,i+1);
        }
        return a;

    }
}
