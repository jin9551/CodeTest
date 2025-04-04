class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        } else if(x==0){
            return true;
        } else if(x%10==0){
            return false;
        }
        long reverse =0;

        while(x>reverse){
            reverse = reverse * 10 + x%10;
            x/=10;
        }

        return (x==reverse) || (x==reverse/10);
    }


}