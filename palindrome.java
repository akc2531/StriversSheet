bool palindrome(int n)
{
    // Write your code here
    int t=n;
    int rev=0;
    while(n>0)
    {
      rev=rev*10+(n%10);
      n/=10;
    }
    if(t==rev)
    return true;
    return false;
}
