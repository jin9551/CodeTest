class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2]; 

        // Solution 1 : brute force
        // // 0~n-1
        // for(int i=0; i<nums.length-1; i++){
        //     // 1~n
        //     for(int j=i+1;j<nums.length;j++){
        //         if(target == nums[i]+nums[j]){
        //             a[0] = i;
        //             a[1] = j;
        //             break; 
        //         }
        //     }
        // }

        // Solution 2 : hashtable
        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i=0; i< nums.length; i++){
            numMap.put(nums[i], i);
        }

        for(int i=0; i< nums.length; i++) {
            // target =  nums[i] + x 의 값이다.
            int diff = target - nums[i];
            // hashmap에 x의 값이 저장되어 있고 그 값이 i와 다르다면
            if(numMap.containsKey(diff) && numMap.get(diff) != i){
                a[0] = i;
                a[1] = numMap.get(diff);
                return a; //new int[]{i, numMap.get(complement)};
            }
        }
        return a;
    }
}