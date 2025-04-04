import java.util.StringTokenizer;
class Solution {
    public int lengthOfLastWord(String s) {
        StringTokenizer st = new StringTokenizer(s);
        String sl = "";
        while(st.hasMoreTokens()){
            sl = st.nextToken();
        }
        return sl.length();
    }
}