//QuesLink :-   https://www.codingninjas.com/studio/problems/ninja-and-the-second-order-elements_6581960?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int ans[]=new int[2];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        ans[0]=a[n-2];
        ans[1]=a[1];
        return ans;
    }
}
