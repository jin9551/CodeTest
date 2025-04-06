class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE/2;
        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            int j = i+1;
            int k = nums.length-1;

            while(j<k){
                int sum = (nums[i]+nums[j]+nums[k]);
                if(Math.abs(target-sum)<Math.abs(target-min)){
                    min = sum;
                } 
                if(sum < target){
                    j++;
                } else{
                    k--;
                }

            }
        }
        return min;
    }
}