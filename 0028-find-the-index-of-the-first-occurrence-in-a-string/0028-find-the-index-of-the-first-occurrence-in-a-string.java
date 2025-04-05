class Solution {
    public int strStr(String haystack, String needle) {
        // return haystack.indexOf(needle); // easy way
    int haylength=haystack.length();
    int needlelength=needle.length();
        if(haylength<needlelength)
            return -1;
        // 짚더미 길이에서 바늘의 길이만큼 뺀만큼 탐색    
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j=0;
            // 짚더미의 문자가 바늘의 문자와 같은경우 
            // j++하여 짚더미 글자와 바늘 글자를 한칸씩 뒤로 이동하여 탐색
            // j가 바늘의 길이만큼 왔다면 i 리턴 (짚더미안에서 바늘의 첫 시작 부분)
            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j==needle.length()){
                return i;
            }
        }
    return -1;

    }
}