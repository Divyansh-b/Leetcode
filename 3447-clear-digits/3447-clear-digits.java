class Solution {
    public String clearDigits(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length() ; i++) {
                if(!(s.charAt(i) >= '0' && s.charAt(i) <='9')){
                    str.append(s.charAt(i));
                }
                if((s.charAt(i) >= '0' && s.charAt(i) <='9')){
                str.deleteCharAt(str.length() - 1);
                }
        }
        return str.toString();
    }
}
