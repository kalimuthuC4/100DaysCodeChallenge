// 452. Minimum Number of Arrows to Burst Balloons

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int ans = 1, e = points[0][1];
        for(int i=1; i<points.length; i++)
        {
            if(points[i][0]>e)
            {
                ans++;
                e = points[i][1];
            }
        }
        return ans;
    }
}
