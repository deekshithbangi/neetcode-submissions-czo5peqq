class Solution {
    public String longestCommonPrefix(String[] strs) {
        int longSeqCount = 0;

        for (int i = 0; i < strs[0].length(); i++) {
            int currCount = 0;

            for (int j = 0; j < strs.length; j++) {
                if (strs[0].charAt(i) == strs[j].charAt(i)) {
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