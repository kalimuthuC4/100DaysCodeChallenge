// 2824. Count Pairs Whose Sum is Less than Target

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int s=0;
        for(int i=0;i<nums.size();i++)
        {
            for(int j=i+1;j<nums.size();j++)
            {
                if((nums.get(i)+nums.get(j))<target)
                {
                    s+=1;
                }
            }
        }
        return s;
    }
}
