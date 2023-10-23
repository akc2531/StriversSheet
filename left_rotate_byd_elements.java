//Linkk Ques :-- https://www.codingninjas.com/studio/problems/left-rotate-an-array-by-one_5026278?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&count=25&page=1&search=&sort_entity=order&sort_order=ASC
import java.util.* ;
import java.io.*;

public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.      
        return rotate(1,arr,n);
    }
    static int[] rotate(int d,int[] arr,int n)
    {
        int temp[] =new int[n];
        int j=0;
        for(int i=d;i<n;i++)
        {
            temp[j]=arr[i];
            j++;
        }
        for(int i=0;i<d;i++)
        {
            temp[j]=arr[i];
            j++;
        }
     return temp;
    }
}
//Here d is number of elements to be shifted in above case is 1
