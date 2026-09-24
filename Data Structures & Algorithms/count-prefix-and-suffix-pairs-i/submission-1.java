class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int res = 0; 

        for(int i = 0; i < words.length - 1; i++) {
            for(int j = i+1; j < words.length; j++) {
                int currL = words[j].length(); 

                if (words[i].length() < currL) {
                    String pre = words[j].substring(0,words[i].length());  
                    String post = words[j].substring(currL - words[i].length()); 

                    if (pre.equals(words[i]) && post.equals(post)) {
                        res += 1; 
                    }
                    
                } 
            } 
        } 
        return res;
    }
}