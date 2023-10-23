import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		int n = new Scanner(System.in).nextInt();
   String s="";
	s+=n;
    int res=0;
	while(n>0)
	{
      res+=Math.pow((n%10),s.length());
	  n/=10;
	}
	if(res==Integer.parseInt(s))
	System.out.print("true");
	else
	System.out.print("false"); 
	}
}
