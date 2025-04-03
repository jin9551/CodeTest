class Solution {
    public int removeDuplicates(int[] nums) {
        // TreeSet<Integer> treeset = new TreeSet<>();

        // for(int i=0; i<nums.length;i++){
        //     treeset.add(nums[i]);
        // }
        // int k = treeset.size();
        // return k;

        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;

    }
}