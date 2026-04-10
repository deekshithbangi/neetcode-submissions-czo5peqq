class Solution {
    public boolean isAnagram(String s, String t) {

     // Plan - 2 
        if(s.length() != t.length()) {
            return false;
        }

        int[] countS = new int[26];
        int[] countT = new int[26];
        for (int i = 0; i < s.length(); i++) {
            countS[s.charAt(i) - 'a']++;
            countT[t.charAt(i) - 'a']++;
        }

        String S = Arrays.toString(countS);
        String T = Arrays.toString(countT);

        return S.equals(T);
    }
}
