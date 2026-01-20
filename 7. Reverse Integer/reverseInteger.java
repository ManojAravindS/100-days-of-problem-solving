class Solution {
    public int reverse(int x) {
        int rev=0, n=1;
        if(x<0) n=-1;
        while(x != 0){
            if(rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE/10 && x%10>7)) return 0;
            if(rev<Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE/10 && x%10<-8)) return 0;
            rev=rev*10+x%10;
            x/=10;
        }
        return rev;
    }
}