class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start) /2;
            // target이 nums[mid]와 같은 경우
            if(target == nums[mid]) return mid;
            // target이 nums[mid]보다 큰 경우
            else if(target > nums[mid]) start = mid + 1;
            // target이 nums[mid]보다 작은 경우
            else  end = mid - 1;
        }

        return -1;
    }
}