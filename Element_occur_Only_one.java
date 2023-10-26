//Link:-https://leetcode.com/problems/single-number/submissions/

public class Solution {
    public static int getSingleElement(int []arr){
        // Write your code here.
        int res=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            res^=arr[i];
        }
        return res;
    }
}
//Using xor if it occur twice then 0 and only 1 then res is carried out
