class Solution {
    public boolean isPalindrome(String s) {

        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && !alphaNumeric(s.charAt(left))) {
                left++;
            }

            while (right > left && !alphaNumeric(s.charAt(right))) {
                right--;
            }
            
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;

            left++;
            right--;
        }

        return true;
    }

    public boolean alphaNumeric(Character ch) {

       return (ch >= 65 && ch <= 90 || 
               ch >= 97 && ch <= 122 ||
               ch >= 48 && ch <= 57);  
    }
}
