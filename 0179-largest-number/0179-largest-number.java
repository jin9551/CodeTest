class Solution {
    public String largestNumber(int[] nums) {
        String[] array =  new String[nums.length];
        for(int i=0; i<nums.length; i++){
            array[i] = String.valueOf(nums[i]);
        }
        // a와 b를 조합하여 가장 큰 수가 앞으로 나오도록 함
        // a= 3, b= 30일 때, a+b는 330, b+a는 303
        // 그리하여 a가 앞으로 오도록 정렬
        Arrays.sort(array,(a,b)-> (b+a).compareTo(a+b));

        if(array[0].equals("0")){
            return "0";
        }

        StringBuilder largest = new StringBuilder();
        for(int i=0; i<array.length; i++){
            largest.append(array[i]);
        }
        return largest.toString();
    }

}