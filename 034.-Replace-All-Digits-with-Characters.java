// 1844. Replace All Digits with Characters

class Solution {
    public String replaceDigits(String s) {

        StringBuilder str = new StringBuilder();
        str.append(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            int n=0;
            if(Character.isDigit(s.charAt(i))){
                n = s.charAt(i);
                str.append((char) (s.charAt(i-1)+n-48));
            }
            else
            {
                str.append(s.charAt(i));
            }

        }
        return str.toString();
    }
}
