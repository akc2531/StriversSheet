//Link Ques https://www.codingninjas.com/studio/problems/remove-duplicates-from-sorted-array_1102307?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
import java.util.ArrayList;

public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
    for(int i=arr.size()-1;i>=0;i--)
      {
        for(int j=i-1;j>=0;j--)
          {
            if(arr.get(i)==arr.get(j))
            {  
            arr.remove(i);
              break;
            }
          }
      }
    return arr.size();
  }
}
