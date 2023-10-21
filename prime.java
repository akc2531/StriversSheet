bool isPrime(int n)
{
	// Write your code here.
	if(n==2||n==1)
	return false;
	for(int i=3;i<n;i++)
	if(n%i==0)
	return false;
	return true;
}
