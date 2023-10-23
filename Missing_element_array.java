class Solution {
    public int missingNumber(int[] nums) {
        int N=nums.length+1;
        int hash[]=new int[N+1];
        for(int i=0;i<N-1;i++)
        {
            hash[nums[i]]++;
        }
        for(int i=1;i<=N;i++)
        {
       if( hash[i]==0)
       return i;
        }
       return -1;
    }
}
