int calcGCD(int n, int m){
    // Write your code here.
    int hcf=0;
    for(int i=1;i<=n||i<m;i++)
    {
        if(n%i==0&&m%i==0)
        hcf=i;
    }
    return hcf;
}
