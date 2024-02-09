// 1189. Maximum Number of Balloons

class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] charCount = new int[26];
        for(int i=0; i<text.length(); i++){
            charCount[text.charAt(i) - 'a']++;
        }

        int min = charCount[1]; //b
        min = Math.min(min, charCount[0]); //a
        min = Math.min(min, charCount[11] / 2); //l
        min = Math.min(min, charCount[14] / 2); // O
        min = Math.min(min, charCount[13]); // n
        return min;
    }
}
