class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        for(int x=0; x<n; x++){
            int y = x-1;
            while(y>=0){
                if(target == nums[x]+nums[y]){
                    return new int[] {x,y};
                }
                y--;
            }
        }
         return new int[] {0,1};
    }
}

