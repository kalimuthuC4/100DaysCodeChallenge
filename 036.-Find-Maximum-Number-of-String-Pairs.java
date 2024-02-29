// 2744. Find Maximum Number of String Pairs

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            String str=words[i];
            for(int j=i+1;j<words.length;j++){
                String s=words[j];
                if(str.charAt(0)==s.charAt(1)&&str.charAt(1)==s.charAt(0)){
                    count++;
                }
            }
        }
        return count;
    }
}
