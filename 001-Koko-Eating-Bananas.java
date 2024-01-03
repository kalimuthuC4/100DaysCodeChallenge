// 875. Koko Eating Bananas

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1; 
        int high = getMaxValue(piles);
        while(low<high)
        {
            int mid = (low+high)/2;
            if(kSpeed(mid,piles,h))
            high = mid;
            else
            low = mid+1;
        }
        return low;
    }
    
    private int getMaxValue(int[] piles){
      int maxPiles = Integer.MIN_VALUE;
      for(int i:piles){
         if(maxPiles<i)
         maxPiles = i;
      }
      return maxPiles; 
    }

    private boolean kSpeed(int mid,int[] piles,int hours)
    {
        int h = 0;
        for(int pile:piles)
        {
            int t = pile/mid;
            h+=t;
            if( pile%mid !=0)
            h++;
        }
        return h<=hours;
    }
}

