class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if(digits == null || digits.length()==0){
            return result;
        }

        Map<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        backTrack(digits, 0, new StringBuilder(), result, map);

        return result;
    }

    public void backTrack(String digits, int index, StringBuilder comb, List<String> result, Map<Character, String> map){

        if(index == digits.length()){
            result.add(comb.toString());
            return;
        }

        String letters = map.get(digits.charAt(index));

        for(char letter : letters.toCharArray()){
            comb.append(letter);
            backTrack(digits, index+1, comb, result, map);
            comb.deleteCharAt(comb.length()-1);
        }
    }
}