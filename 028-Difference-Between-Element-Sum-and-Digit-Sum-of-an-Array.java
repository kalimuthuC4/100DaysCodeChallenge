// 2535. Difference Between Element Sum and Digit Sum of an Array

class Solution {
    public int differenceOfSum(int[] nums) {
        int s = 0, ds = 0;
        for(int n:nums)
        {
            s+=n;
        }
        for(int i=0;i<nums.length;i++)
        {
            int num = nums[i];
            while(num>0)
            {
                int r = num%10;
                ds+=r;
                num/=10;
            }
            num=0;
        }
        int ts = s-ds;
        if(ts>0)
        return ts;
        else
        return ts*-1;
        
        // return ds;
    }
}
