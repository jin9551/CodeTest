class Solution {
    public int searchInsert(int[] nums, int target) {
        // if(nums[i]<target && nums[i+1] >= target)
        // return i+1;
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid-1;
            else start = mid+1;
        }

        return start;
    }
}