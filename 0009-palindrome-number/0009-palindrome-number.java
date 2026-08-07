class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        long  rev=0;
        long orginal=x;
        while(x!=0){
            long n = x%10;
            rev=rev*10+n;
            x=x/10;
        }
        return (orginal==rev);
}
}