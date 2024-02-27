//2315. Count Asterisks

class Solution {
    public int countAsterisks(String s) {
        int asteriskCount = 0;
        int barCount = 0; 

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '*') {
                if (barCount % 2 == 0) {
                    asteriskCount++; 
                 }
            } else if (s.charAt(i) == '|') {
                barCount++; 
            }
        }
        return asteriskCount; 
    }
}
