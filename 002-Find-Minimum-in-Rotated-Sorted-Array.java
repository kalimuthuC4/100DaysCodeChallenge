//153. Find Minimum in Rotated Sorted Array
class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int h = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(l<=h)
        {
            int mid = (l+h)/2;
            if(nums[l]<=nums[mid]){
                if(min>nums[l]){
                    min = nums[l];
                }
                l = mid+1;
            }
            else{
                    if(min>nums[mid])
                    {
                        min = nums[mid];
                    }
                h = mid-1;
            }
        }
        return min;
    }
}
