class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2]; 
        // 0~n-1
        for(int i=0; i<nums.length-1; i++){
            // 1~n
            for(int j=i+1;j<nums.length;j++){
                if(target == nums[i]+nums[j]){
                    a[0] = i;
                    a[1] = j;
                    break; 
                }
            }
        }
        return a;
    }
}