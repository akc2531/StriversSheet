  import java.util.*;
  public class Main {
	
	public static void main(String[] args) {
		// Write your code here
      
      int n = new Scanner(System.in).nextInt();
	  int se=0,so=0;
	   while(n!=0)
	   {
		   
		  if((n%10)%2==0)
		  se+=n%10;
		  else
		  so+=n%10;
		  n/=10;
	   }
      System.out.print(se+" "+so);
}
}
