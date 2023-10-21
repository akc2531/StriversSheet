public class Solution
{
    public static int[] printNos(int x) {
        // Write Your Code Here
        return print(0,new int[x]);
    }
     public static int[] print(int i,int a[])
     {
         if(i<a.length)
         {
             a[i]=a.length-i;
             print(i+1,a);
         }
         return a;
     }
}
