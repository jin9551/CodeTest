class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> maps = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            maps.put(nums[i], i);
        }

        for(int i=0; i<n; i++){
            int diff = target - nums[i];
            if(maps.containsKey(diff) && maps.get(diff)!=i){
                return new int[] {i,maps.get(diff)};
            }
        }
        return new int[] {};
    }
}

