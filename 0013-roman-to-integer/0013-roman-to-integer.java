class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum = 0;
        for(int i=0;i<s.length();i++){
            // 로마 숫자는 앞에서부터 큰 수가 이어져 온다.
            // 만약 현재 숫자가 뒤의 숫자보다 작다면
            // IV(4 = 5-1) 나 IX(9 = 10-1)처럼 특이한 케이스다.
            if(i<s.length()-1 &&  map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                sum -= map.get(s.charAt(i));
            } else {
                sum += map.get(s.charAt(i));
            }

        }

        return sum;
    }
}