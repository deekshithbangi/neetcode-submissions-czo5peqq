class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String alphsNumericStr = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (('a' <= c && c <= 'z') ||
                    ('A' <= c && c <= 'Z') ||
                    ('0' <= c && c <= '9')) {
              alphsNumericStr += c; 
            }
        }

        System.out.println(alphsNumericStr); 
        for (int i = 0; i < alphsNumericStr.length() / 2; i++) {
            if (alphsNumericStr.charAt(i) != alphsNumericStr.charAt(alphsNumericStr.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
