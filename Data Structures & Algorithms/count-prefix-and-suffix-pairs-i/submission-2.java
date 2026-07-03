class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int res = 0; 

        for(int i = 0; i < words.length - 1; i++) {
            System.out.println(words[i] + " = "); 
            for(int j = i+1; j < words.length; j++) {
                 
                if (words[i].length() <= words[j].length()) {
                    String post = words[j].substring(0, words[i].length()); 
                    String pre = words[j].substring(words[j].length() - words[i].length());  

                    if (pre.equals(words[i]) && post.equals(words[i])) {
                        res += 1; 
                    }
                } 
            } 
        } 
        return res;
    }
}