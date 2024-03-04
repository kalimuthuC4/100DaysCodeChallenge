// 2418. Sort the People

class Solution {
    public String[] sortPeople(String[] names, int[] h) {
        HashMap<Integer,String> m = new HashMap<>();
        for(int i=0;i<names.length;i++)
        {
            m.put(h[i],names[i]);
            System.out.print(m.get(h[i]));
        }
        Arrays.sort(h);
        int c=0;
        String[] s = new String[names.length];
        for(int i=h.length-1;i>=0;i--)
        {
             s[c] = m.get(h[i]).toString();
             c++;
        }
        return s;
    }
}

