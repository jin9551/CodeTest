class Solution {
    public int reverse(int x) {
        boolean neg = x<0;
        String s = String.valueOf(Math.abs(x));
        StringBuilder sb = new StringBuilder(s).reverse();
        int ans;

        try {
            ans = Integer.parseInt(sb.toString());
        } catch (Exception e) {
            return 0;
        }

        return neg ? -ans : ans;
    }
}