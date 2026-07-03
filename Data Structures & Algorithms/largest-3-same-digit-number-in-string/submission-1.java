class Solution {
    public String largestGoodInteger(String num) {
       int ans = -1; 

       for(int i = 0; i < num.length() - 2; i++) {
            String good = num.substring(i, i+3); 
            System.out.println(good);
            if (good.charAt(0) == good.charAt(1) && good.charAt(1) == good.charAt(2)) {
                ans = Math.max(ans, Integer.parseInt(good));
            }
       }  
       if (ans == 0) return "000"; 
       else if (ans == -1) return ""; 
       else return Integer.toString(ans); 
    }
}