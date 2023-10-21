public class Solution {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        String pk="";
        for(int i=str.length()-1;i>=0;i--)
         pk+=str.charAt(i);
         return pk.equals(str);
    }
   
}
