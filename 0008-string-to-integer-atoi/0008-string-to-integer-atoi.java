class Solution {
    public int myAtoi(String s) {
        // 지 ㅈ대로 임 "   +0 123" 이거는 0인데
        // "   +004500" 이거는 4500임.. 테스트 케이스 만든놈 대가리 깨야함

                if (s.equals("")) {
			return 0;
		}
		
		// helper variables
		int res = 0, i = 0, sign = 1;
		
		// get rid of whitespace
		while (i < s.length() && s.charAt(i) == ' ') {
			i++;
		}
		
		// check for sign
		if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
			// change if negative, iterate
			if (s.charAt(i++) == '-') {
				sign = -1;
			}
		}
		
		// now iterate across digits if any
		// should only be in range 0-9
		while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
			// check if we will go over the max
			if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > 7)) {
				if (sign == -1) {
					return Integer.MIN_VALUE;
				}
				return Integer.MAX_VALUE;
			}
			
			// update res
			res = res * 10 + (s.charAt(i++) - '0');
		}
		return sign * res;


        /*
        String str = s.replaceAll(" ","");
        //System.out.println(str);
        StringBuilder sb = new StringBuilder();

        if(str.length()==0) return 0;

        int ans;
        char N = ' ';
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(i==0 && !Character.isDigit(c)) {
                if(c=='+') {
                    N=c;
                    continue;
                }else if(c=='-'){
                    N=c;
                } else if(c=='.' ||c==',') {
                    break;
                }
            } else if(!Character.isDigit(c) && (Character.isLetter(c) || c=='+' || c=='-' || c=='.' ||c==',') && i!=0){
                break;
            } else if(Character.isDigit(c)){
                sb.append(c);
            }
        }

        if(sb.length()==0){
            return 0;
        } else if(sb.charAt(0)=='0' && N=='+'){
            return 0;
        }
        
        try {
            ans = Integer.parseInt(sb.toString());
        } catch (Exception e) {
            return N=='-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }


        return N=='-' ? -ans : ans;
        */
    }
}