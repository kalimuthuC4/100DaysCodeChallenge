// 1662. Check If Two String Arrays are Equivalent

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(int i=0;i<word1.length;i++){
            s1.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++)
        {
            s2.append(word2[i]);
        }
        System.out.print(s1+" "+s2);
        if(s1.toString().equals(s2.toString()))
        return true;
        else
        return false;
    }
}
