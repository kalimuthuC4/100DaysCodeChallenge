// 3010. Divide an Array Into Subarrays With Minimum Cost I

public class Solution {
    public int minimumCost(int[] v) {
        int n = v.length;
        int s = v[0];
        Arrays.sort(v, 1, n);
        s = s + v[1] + v[2];
        return s;
    }
}
