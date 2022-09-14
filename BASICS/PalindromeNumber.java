class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int temp=x;
        int t=x%10;
        x/=10;
        while(x>0)
        {
          t=t*10+x%10;
            x/=10;
        }
        if(temp==t)
            return true;
        return false;
    }
}
