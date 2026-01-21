class Solution {
    public int myAtoi(String s) {
        int i = 0, n = 1, number = 0;
        while(i < s.length() && s.charAt(i) == ' ') i++;
        if(i == s.length()) return 0;
        if(s.charAt(i) == '-' || s.charAt(i)=='+'){
            n=s.charAt(i)=='-'?-1:1;
            i++;
        }
        while(i < s.length()){
            int digit = s.charAt(i)-'0';
            if(digit<0 || digit>9) break;
            if(number>(Integer.MAX_VALUE-digit)/10) return n==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            number=number*10+digit;
            i++;
        }
        return n*number;
    }
}