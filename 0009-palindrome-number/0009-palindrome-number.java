class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        } else if(x==0){
            return true;
        } else if(x%10==0){
            return false;
        }
        int comp = x;
        long reverse =0;

        while(comp!=0){
            reverse = reverse * 10 + comp%10;
            comp/=10;
        }

        return x==reverse;
    }


}