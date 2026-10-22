class Solution {
    public int mySqrt(int x) {
       int low=0;
       int high=x;
       int res=0;
       while(low<=high)
       {
            int mid=(high+low)/2;
            if((long)mid*mid==x)
            {
                return mid;
            }
            else if((long)mid*mid>x)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
       } 
       return high;
       
    }
}