//Note :- Doo not print in java like that of for
import java.util.List;
public class Solution {
    public static void printNtimes(int n){
        // Write your code here.
        print(n,1);
        
    }
    public static void print(int n,int i)
    {
        if(i<=n)
        {
        System.out.print("Coding Ninjas ");
        print(n,i+1);
        }
    }
}
