class Solution {
    public String longestCommonPrefix(String[] strs) {
        int smallestStr = strs[0].length(); 
        int smallestStrIdx = 0;

        for(int i = 0; i < strs.length; i++) {
            if (strs[i].length() < smallestStr){ 
                smallestStr = strs[i].length();
                smallestStrIdx = i;
            }
        }

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals("")) {
                return "";
            } 
        }        
        
        int longSeqCount = 0;

        for (int i = 0; i < strs[smallestStrIdx].length(); i++) {
            int currCount = 0;

            for (int j = 0; j < strs.length; j++) {
                if (strs[smallestStrIdx].charAt(i) == strs[j].charAt(i)) {
                    currCount++;
                } 
                else {
                    return strs[0].substring(0,longSeqCount);
                }
            }

            if (currCount == strs.length ){
                longSeqCount++; 
            }
            currCount = 0;
        }
        return strs[0].substring(0,longSeqCount);
    }
}