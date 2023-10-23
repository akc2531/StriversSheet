//Ques Link :-- https://www.codingninjas.com/studio/problems/ninja-and-the-sorted-check_6581957?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class Solution {
    public static int isSorted(int n, int []a) {
        // Write your code here.
       boolean res= sorted(n,a);
       if(res==true)
       return 1;
       return 0;
     
    }
    public static boolean sorted(int n ,int a[])
    {
           if(n==0||n==1)
        return true;
        return ((a[n-2]<=a[n-1])&&sorted(n-1,a));
    }
}
