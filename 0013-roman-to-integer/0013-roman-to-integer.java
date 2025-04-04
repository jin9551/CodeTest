class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> maps = new HashMap<>();
        maps.put('I', 1);
        maps.put('V', 5);
        maps.put('X', 10);
        maps.put('L', 50);
        maps.put('C', 100);
        maps.put('D', 500);
        maps.put('M', 1000);

        int sum = 0;
        for(int i=0; i<s.length(); i++){
            int cur = maps.get(s.charAt(i));
            // 현재 값이 이전 값 보다 크다면
            if(i<s.length()-1 && cur<maps.get(s.charAt(i+1))){
                // sum에서 이번 값을 뺀다. 
                sum -= cur;
            } else {
                // 아니라면 현재 값을 더 해준다.
                sum += cur;
            }

        }

        return sum;
    }
}