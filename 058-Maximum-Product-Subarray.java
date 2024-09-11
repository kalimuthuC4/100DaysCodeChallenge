// 152. Maximum Product Subarray

class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], m = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int a = nums[i];
            if (a < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(a, max * a);
            min = Math.min(a, min * a);
            m = Math.max(m, max);
        }
        return m;
    }
}
