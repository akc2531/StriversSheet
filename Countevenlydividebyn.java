public class Solution {
    public static int countDigits(int n){
        // Write your code here.
        int i = 0;   
        int temp = n;    
        while(temp!= 0)
        {   
        int rem = temp%10; 
        if(rem != 0 && n%rem == 0)
        {               
         i = i+ 1  ;      
        }         
        temp /= 10;  
        } 
         return i;
    }
}
