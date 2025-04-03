class Solution {
    public boolean isPalindrome(int x) {
        // x가 음수이거나 0으로 끝날 경우 팰린드롬이 될 수 없다. 
        if(x<0 || (x!=0 && x%10==0)) return false;

        int reversed = 0;
        //반절만 비교하기
        
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return (x == reversed) || (x == reversed / 10);

        // 숫자 전체를 뒤짚어서 하기
        // long reversed = 0;
        // long temp = x;

        // while (temp != 0) {
            // x의 뒷자리를 %로 구해서 
        //     int digit = (int) (temp % 10);
            // 뒷자리를 reversed의 뒤에 더해준다. 기존 reversed는 *10 하여 자릿수를 올려준다.
        //     reversed = reversed * 10 + digit;
            // 뒷자리를 제거 했으니 /10하여 자릿수 내리기
        //     temp /= 10;
        // }

        // return (reversed == x);


        // String s = String.valueOf(x);
        // int start = 0;
        // int end = s.length()-1;

        // while(start<=end){
        //     if(s.charAt(start)==s.charAt(end)){
        //         start++;
        //         end--;
        //     } else {
        //         return false;
        //     }
        // }

        // return true;

    }
}