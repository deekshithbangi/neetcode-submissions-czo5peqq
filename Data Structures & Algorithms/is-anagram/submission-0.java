class Solution {
    public boolean isAnagram(String s, String t) {
        /*  Plan - 1
            if s.length != t.length then return false 
            create an map for each string 
            s = anagram 
                a = 3 
                n = 1 
                g = 1 
                r = 1 
                m = 1
            t = nagaram 
                a = 3 
                n = 1 
                g = 1 
                r = 1 
                m = 1

        */ 
        if(s.length() != t.length()) {
           return false;
        }

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        mapping(s, countS);
        mapping(t, countT);


        return countS.equals(countT);
    }

    private void mapping(String s, HashMap<Character, Integer> count) {
        for (int i = 0; i < s.length(); i++) {
            if(count.containsKey(s.charAt(i))) {
                count.put(s.charAt(i), count.get(s.charAt(i)) + 1);
            }
           else
                count.put(s.charAt(i), 1);
        }

    }
    
}
