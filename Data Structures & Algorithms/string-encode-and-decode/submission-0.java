class Solution {

    public String encode(List<String> strs) {
        String res = ""; 
        
        for (String s : strs) {
            // res += s + (String) (s.length() + "#"); 
            res += s + "#";
        }
        return res;
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        char[]  charArray = str.toCharArray();
        String s = "";
        for(Character ch : charArray) {
            if(ch.equals('#')) {
                res.add(s); 
                s = ""; 
            }
            else s += ch;
        }
        return res;
    }
}
