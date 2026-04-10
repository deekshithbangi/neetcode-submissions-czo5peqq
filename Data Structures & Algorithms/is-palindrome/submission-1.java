class Solution {
    public boolean alphaNumeric(Character ch) {

        if (ch >= 65 && ch <= 90 || 
            ch >= 97 && ch <= 122 ||
            ch >= 48 && ch <= 57
        ) return true; 
        else return false; 
    }
    
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int left = 0, right = s.length() - 1;

        while (left <= right) {
            while (left < right && !alphaNumeric(s.charAt(left))) {
                left++;
            }

            while (left < right && !alphaNumeric(s.charAt(right))) {
                right--;
            }
            
            if (s.charAt(left) != s.charAt(right)) return false;
            
            left++;
            right--;
        }

        return true;
    }
}
